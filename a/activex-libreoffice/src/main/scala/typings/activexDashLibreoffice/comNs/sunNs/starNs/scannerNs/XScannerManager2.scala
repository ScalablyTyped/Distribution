package typings.activexDashLibreoffice.comNs.sunNs.starNs.scannerNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XBitmap
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extension of {@link XScannerManager} .
  * @since LibreOffice 3.5
  */
trait XScannerManager2 extends XScannerManager {
  /**
    * produce some kind of User Interface to let the user have a preview, configure the scan area, etc., it, and scan it returns FALSE if user cancelled
    * this process
    */
  def configureScannerAndScan(scannerContext: js.Array[ScannerContext], listener: XEventListener): Boolean
}

object XScannerManager2 {
  @scala.inline
  def apply(
    AvailableScanners: SafeArray[ScannerContext],
    acquire: () => Unit,
    configureScanner: js.Array[ScannerContext] => Boolean,
    configureScannerAndScan: (js.Array[ScannerContext], XEventListener) => Boolean,
    getAvailableScanners: () => SafeArray[ScannerContext],
    getBitmap: ScannerContext => XBitmap,
    getError: ScannerContext => ScanError,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    startScan: (ScannerContext, XEventListener) => Unit
  ): XScannerManager2 = {
    val __obj = js.Dynamic.literal(AvailableScanners = AvailableScanners, acquire = js.Any.fromFunction0(acquire), configureScanner = js.Any.fromFunction1(configureScanner), configureScannerAndScan = js.Any.fromFunction2(configureScannerAndScan), getAvailableScanners = js.Any.fromFunction0(getAvailableScanners), getBitmap = js.Any.fromFunction1(getBitmap), getError = js.Any.fromFunction1(getError), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startScan = js.Any.fromFunction2(startScan))
  
    __obj.asInstanceOf[XScannerManager2]
  }
}

