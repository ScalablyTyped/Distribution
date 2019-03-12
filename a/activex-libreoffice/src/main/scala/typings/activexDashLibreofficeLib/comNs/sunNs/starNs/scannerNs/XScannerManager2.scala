package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs

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
  def configureScannerAndScan(
    scannerContext: js.Array[ScannerContext],
    listener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener
  ): scala.Boolean
}

object XScannerManager2 {
  @scala.inline
  def apply(
    AvailableScanners: stdLib.SafeArray[ScannerContext],
    acquire: () => scala.Unit,
    configureScanner: js.Array[ScannerContext] => scala.Boolean,
    configureScannerAndScan: (js.Array[ScannerContext], activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener) => scala.Boolean,
    getAvailableScanners: () => stdLib.SafeArray[ScannerContext],
    getBitmap: ScannerContext => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap,
    getError: ScannerContext => ScanError,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    startScan: (ScannerContext, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener) => scala.Unit
  ): XScannerManager2 = {
    val __obj = js.Dynamic.literal(AvailableScanners = AvailableScanners, acquire = js.Any.fromFunction0(acquire), configureScanner = js.Any.fromFunction1(configureScanner), configureScannerAndScan = js.Any.fromFunction2(configureScannerAndScan), getAvailableScanners = js.Any.fromFunction0(getAvailableScanners), getBitmap = js.Any.fromFunction1(getBitmap), getError = js.Any.fromFunction1(getError), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startScan = js.Any.fromFunction2(startScan))
  
    __obj.asInstanceOf[XScannerManager2]
  }
}

