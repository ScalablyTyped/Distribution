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

