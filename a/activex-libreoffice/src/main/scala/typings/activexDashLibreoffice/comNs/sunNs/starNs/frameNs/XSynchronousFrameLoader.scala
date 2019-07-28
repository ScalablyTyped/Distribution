package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * loads a resource into a {@link Frame} .
  *
  * Unlike the {@link XFrameLoader} interface, this loading will be synchronous.
  * @see XFrameLoader
  */
trait XSynchronousFrameLoader extends XInterface {
  /**
    * cancels the loading process.
    *
    * No notifications (neither to the frame or the caller) must be notified. Because it's a synchronous process this cancel call can be forced by another
    * thread the loader thread only. Method {@link XSynchronousFrameLoader.load()} must return `FALSE` then and caller of this method {@link
    * XSynchronousFrameLoader.cancel()} already knows the state ...
    */
  def cancel(): Unit
  /**
    * starts the loading of the specified resource into the specified {@link Frame} .
    * @param Descriptor describes the resource which should be loaded It use a {@link com.sun.star.document.MediaDescriptor} for that.
    * @param Frame the target frame which should contain the new loaded component
    * @returns `TRUE` if loading is successfully ; `FALSE` otherwise
    */
  def load(Descriptor: SeqEquiv[PropertyValue], Frame: XFrame): Boolean
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
}

