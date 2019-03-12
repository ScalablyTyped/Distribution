package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XScannerManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns all available scanner devices */
  val AvailableScanners: stdLib.SafeArray[ScannerContext]
  /** produce some kind of User Interface to let the user have a preview, configure the scan area, etc., it returns FALSE if user cancelled this process */
  def configureScanner(scannerContext: js.Array[ScannerContext]): scala.Boolean
  /** returns all available scanner devices */
  def getAvailableScanners(): stdLib.SafeArray[ScannerContext]
  /** get the image after completion of scan */
  def getBitmap(scannerContext: ScannerContext): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap
  /** get the state of scanning after completion of scan */
  def getError(scannerContext: ScannerContext): ScanError
  /**
    * start the scanning process listener will be called when scan is complete the EventObject of the disposing call will contain the {@link ScannerManager}
    * if the scan was successful, an empty interface otherwise
    */
  def startScan(
    scannerContext: ScannerContext,
    listener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener
  ): scala.Unit
}

object XScannerManager {
  @scala.inline
  def apply(
    AvailableScanners: stdLib.SafeArray[ScannerContext],
    acquire: () => scala.Unit,
    configureScanner: js.Array[ScannerContext] => scala.Boolean,
    getAvailableScanners: () => stdLib.SafeArray[ScannerContext],
    getBitmap: ScannerContext => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap,
    getError: ScannerContext => ScanError,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    startScan: (ScannerContext, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener) => scala.Unit
  ): XScannerManager = {
    val __obj = js.Dynamic.literal(AvailableScanners = AvailableScanners, acquire = js.Any.fromFunction0(acquire), configureScanner = js.Any.fromFunction1(configureScanner), getAvailableScanners = js.Any.fromFunction0(getAvailableScanners), getBitmap = js.Any.fromFunction1(getBitmap), getError = js.Any.fromFunction1(getError), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startScan = js.Any.fromFunction2(startScan))
  
    __obj.asInstanceOf[XScannerManager]
  }
}

