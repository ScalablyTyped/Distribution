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

