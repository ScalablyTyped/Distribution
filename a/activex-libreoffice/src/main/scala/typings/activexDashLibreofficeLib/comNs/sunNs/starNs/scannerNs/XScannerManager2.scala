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
    AvailableScanners: activexDashInteropLib.SafeArray[ScannerContext],
    acquire: js.Function0[scala.Unit],
    configureScanner: js.Function1[js.Array[ScannerContext], scala.Boolean],
    configureScannerAndScan: js.Function2[
      js.Array[ScannerContext], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, 
      scala.Boolean
    ],
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
  ): XScannerManager2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AvailableScanners")(AvailableScanners)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("configureScanner")(configureScanner)
    __obj.updateDynamic("configureScannerAndScan")(configureScannerAndScan)
    __obj.updateDynamic("getAvailableScanners")(getAvailableScanners)
    __obj.updateDynamic("getBitmap")(getBitmap)
    __obj.updateDynamic("getError")(getError)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("startScan")(startScan)
    __obj.asInstanceOf[XScannerManager2]
  }
}

