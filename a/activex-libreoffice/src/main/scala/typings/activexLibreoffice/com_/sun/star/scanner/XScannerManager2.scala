package typings.activexLibreoffice.com_.sun.star.scanner

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XBitmap
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extension of {@link XScannerManager} .
  * @since LibreOffice 3.5
  */
@js.native
trait XScannerManager2 extends XScannerManager {
  
  /**
    * produce some kind of User Interface to let the user have a preview, configure the scan area, etc., it, and scan it returns FALSE if user cancelled
    * this process
    */
  def configureScannerAndScan(scannerContext: js.Array[ScannerContext], listener: XEventListener): Boolean = js.native
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
    val __obj = js.Dynamic.literal(AvailableScanners = AvailableScanners.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), configureScanner = js.Any.fromFunction1(configureScanner), configureScannerAndScan = js.Any.fromFunction2(configureScannerAndScan), getAvailableScanners = js.Any.fromFunction0(getAvailableScanners), getBitmap = js.Any.fromFunction1(getBitmap), getError = js.Any.fromFunction1(getError), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startScan = js.Any.fromFunction2(startScan))
    __obj.asInstanceOf[XScannerManager2]
  }
  
  @scala.inline
  implicit class XScannerManager2Ops[Self <: XScannerManager2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigureScannerAndScan(value: (js.Array[ScannerContext], XEventListener) => Boolean): Self = this.set("configureScannerAndScan", js.Any.fromFunction2(value))
  }
}
