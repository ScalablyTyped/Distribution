package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * loads a resource into a {@link Frame} .
  *
  * Unlike the {@link XFrameLoader} interface, this loading will be synchronous.
  * @see XFrameLoader
  */
@js.native
trait XSynchronousFrameLoader extends XInterface {
  
  /**
    * cancels the loading process.
    *
    * No notifications (neither to the frame or the caller) must be notified. Because it's a synchronous process this cancel call can be forced by another
    * thread the loader thread only. Method {@link XSynchronousFrameLoader.load()} must return `FALSE` then and caller of this method {@link
    * XSynchronousFrameLoader.cancel()} already knows the state ...
    */
  def cancel(): Unit = js.native
  
  /**
    * starts the loading of the specified resource into the specified {@link Frame} .
    * @param Descriptor describes the resource which should be loaded It use a {@link com.sun.star.document.MediaDescriptor} for that.
    * @param Frame the target frame which should contain the new loaded component
    * @returns `TRUE` if loading is successfully ; `FALSE` otherwise
    */
  def load(Descriptor: SeqEquiv[PropertyValue], Frame: XFrame): Boolean = js.native
}
object XSynchronousFrameLoader {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    cancel: () => Unit,
    load: (SeqEquiv[PropertyValue], XFrame) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSynchronousFrameLoader = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), load = js.Any.fromFunction2(load), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSynchronousFrameLoader]
  }
  
  @scala.inline
  implicit class XSynchronousFrameLoaderOps[Self <: XSynchronousFrameLoader] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoad(value: (SeqEquiv[PropertyValue], XFrame) => Boolean): Self = this.set("load", js.Any.fromFunction2(value))
  }
}
