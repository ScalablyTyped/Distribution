package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XScannerManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns all available scanner devices */
  val AvailableScanners: activexDashInteropLib.SafeArray[ScannerContext]
  /** produce some kind of User Interface to let the user have a preview, configure the scan area, etc., it returns FALSE if user cancelled this process */
  def configureScanner(scannerContext: js.Array[ScannerContext]): scala.Boolean
  /** returns all available scanner devices */
  def getAvailableScanners(): activexDashInteropLib.SafeArray[ScannerContext]
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
    AvailableScanners: activexDashInteropLib.SafeArray[ScannerContext],
    acquire: js.Function0[scala.Unit],
    configureScanner: js.Function1[js.Array[ScannerContext], scala.Boolean],
    getAvailableScanners: js.Function0[activexDashInteropLib.SafeArray[ScannerContext]],
    getBitmap: js.Function1[ScannerContext, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap],
    getError: js.Function1[ScannerContext, ScanError],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    startScan: js.Function2[
      ScannerContext, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, 
      scala.Unit
    ]
  ): XScannerManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AvailableScanners")(AvailableScanners)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("configureScanner")(configureScanner)
    __obj.updateDynamic("getAvailableScanners")(getAvailableScanners)
    __obj.updateDynamic("getBitmap")(getBitmap)
    __obj.updateDynamic("getError")(getError)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("startScan")(startScan)
    __obj.asInstanceOf[XScannerManager]
  }
}

