package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows for getting information about a print job.
  *
  * {@link XPrintableBroadcaster} can be implemented by classes which implement {@link XPrintable} . It allows a {@link XPrintableListener} to be
  * registered, thus a client object will learn about the print progress.
  * @see XPrintableListener
  */
@js.native
trait XPrintableBroadcaster extends XInterface {
  
  /** adds an {@link XPrintableListener} to be notified about print progress. */
  def addPrintableListener(xListener: XPrintableListener): Unit = js.native
  
  /** removes an {@link XPrintableListener} . */
  def removePrintableListener(xListener: XPrintableListener): Unit = js.native
}
object XPrintableBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addPrintableListener: XPrintableListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePrintableListener: XPrintableListener => Unit
  ): XPrintableBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addPrintableListener = js.Any.fromFunction1(addPrintableListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePrintableListener = js.Any.fromFunction1(removePrintableListener))
    __obj.asInstanceOf[XPrintableBroadcaster]
  }
  
  @scala.inline
  implicit class XPrintableBroadcasterOps[Self <: XPrintableBroadcaster] (val x: Self) extends AnyVal {
    
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
    def setAddPrintableListener(value: XPrintableListener => Unit): Self = this.set("addPrintableListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemovePrintableListener(value: XPrintableListener => Unit): Self = this.set("removePrintableListener", js.Any.fromFunction1(value))
  }
}
