package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a virtual printer.
  *
  * All properties are vetoable properties. If you change the properties between a call to {@link com.sun.star.awt.XPrinter.startPage()} and a call to
  * {@link com.sun.star.awt.XPrinter.endPage()} , a {@link com.sun.star.beans.PropertyVetoException} is thrown.
  */
@js.native
trait XPrinter extends XPrinterPropertySet {
  
  /**
    * notifies the printer spooler that the job is done and printing starts.
    * @see terminate
    */
  def end(): Unit = js.native
  
  /** ends the current page. */
  def endPage(): Unit = js.native
  
  /**
    * puts the job into the printer spooler.
    *
    * This call may block the thread. So release all resources (mutex, semaphore, etc.) before this call.
    */
  def start(nJobName: String, nCopies: Double, nCollate: Boolean): Boolean = js.native
  
  /** begins with a new page. */
  def startPage(): XDevice = js.native
  
  /**
    * stops the current print job.
    *
    * If the method {@link com.sun.star.awt.XPrinter.end()} is called beforehand, then this call does nothing. If you call {@link
    * com.sun.star.awt.XPrinter.terminate()} in or before the call to {@link com.sun.star.awt.XPrinter.start()} , {@link
    * com.sun.star.awt.XPrinter.terminate()} returns `FALSE` . This call must not block the thread.
    * @see end
    */
  def terminate(): Unit = js.native
}
object XPrinter {
  
  @scala.inline
  def apply(
    BinarySetup: SafeArray[Double],
    FormDescriptions: SafeArray[String],
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    end: () => Unit,
    endPage: () => Unit,
    getBinarySetup: () => SafeArray[Double],
    getFormDescriptions: () => SafeArray[String],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    selectForm: String => Unit,
    setBinarySetup: SeqEquiv[Double] => Unit,
    setHorizontal: Boolean => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    start: (String, Double, Boolean) => Boolean,
    startPage: () => XDevice,
    terminate: () => Unit
  ): XPrinter = {
    val __obj = js.Dynamic.literal(BinarySetup = BinarySetup.asInstanceOf[js.Any], FormDescriptions = FormDescriptions.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), end = js.Any.fromFunction0(end), endPage = js.Any.fromFunction0(endPage), getBinarySetup = js.Any.fromFunction0(getBinarySetup), getFormDescriptions = js.Any.fromFunction0(getFormDescriptions), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), selectForm = js.Any.fromFunction1(selectForm), setBinarySetup = js.Any.fromFunction1(setBinarySetup), setHorizontal = js.Any.fromFunction1(setHorizontal), setPropertyValue = js.Any.fromFunction2(setPropertyValue), start = js.Any.fromFunction3(start), startPage = js.Any.fromFunction0(startPage), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[XPrinter]
  }
  
  @scala.inline
  implicit class XPrinterOps[Self <: XPrinter] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndPage(value: () => Unit): Self = this.set("endPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: (String, Double, Boolean) => Boolean): Self = this.set("start", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStartPage(value: () => XDevice): Self = this.set("startPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTerminate(value: () => Unit): Self = this.set("terminate", js.Any.fromFunction0(value))
  }
}
