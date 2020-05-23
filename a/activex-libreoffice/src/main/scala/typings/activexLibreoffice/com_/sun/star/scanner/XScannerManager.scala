package typings.activexLibreoffice.com_.sun.star.scanner

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XBitmap
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XScannerManager extends XInterface {
  /** returns all available scanner devices */
  val AvailableScanners: SafeArray[ScannerContext]
  /** produce some kind of User Interface to let the user have a preview, configure the scan area, etc., it returns FALSE if user cancelled this process */
  def configureScanner(scannerContext: js.Array[ScannerContext]): Boolean
  /** returns all available scanner devices */
  def getAvailableScanners(): SafeArray[ScannerContext]
  /** get the image after completion of scan */
  def getBitmap(scannerContext: ScannerContext): XBitmap
  /** get the state of scanning after completion of scan */
  def getError(scannerContext: ScannerContext): ScanError
  /**
    * start the scanning process listener will be called when scan is complete the EventObject of the disposing call will contain the {@link ScannerManager}
    * if the scan was successful, an empty interface otherwise
    */
  def startScan(scannerContext: ScannerContext, listener: XEventListener): Unit
}

object XScannerManager {
  @scala.inline
  def apply(
    AvailableScanners: SafeArray[ScannerContext],
    acquire: () => Unit,
    configureScanner: js.Array[ScannerContext] => Boolean,
    getAvailableScanners: () => SafeArray[ScannerContext],
    getBitmap: ScannerContext => XBitmap,
    getError: ScannerContext => ScanError,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    startScan: (ScannerContext, XEventListener) => Unit
  ): XScannerManager = {
    val __obj = js.Dynamic.literal(AvailableScanners = AvailableScanners.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), configureScanner = js.Any.fromFunction1(configureScanner), getAvailableScanners = js.Any.fromFunction0(getAvailableScanners), getBitmap = js.Any.fromFunction1(getBitmap), getError = js.Any.fromFunction1(getError), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startScan = js.Any.fromFunction2(startScan))
    __obj.asInstanceOf[XScannerManager]
  }
}

