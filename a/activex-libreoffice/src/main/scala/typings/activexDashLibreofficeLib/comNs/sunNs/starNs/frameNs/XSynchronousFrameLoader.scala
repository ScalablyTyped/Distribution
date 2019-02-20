package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * loads a resource into a {@link Frame} .
  *
  * Unlike the {@link XFrameLoader} interface, this loading will be synchronous.
  * @see XFrameLoader
  */
trait XSynchronousFrameLoader
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * cancels the loading process.
    *
    * No notifications (neither to the frame or the caller) must be notified. Because it's a synchronous process this cancel call can be forced by another
    * thread the loader thread only. Method {@link XSynchronousFrameLoader.load()} must return `FALSE` then and caller of this method {@link
    * XSynchronousFrameLoader.cancel()} already knows the state ...
    */
  def cancel(): scala.Unit
  /**
    * starts the loading of the specified resource into the specified {@link Frame} .
    * @param Descriptor describes the resource which should be loaded It use a {@link com.sun.star.document.MediaDescriptor} for that.
    * @param Frame the target frame which should contain the new loaded component
    * @returns `TRUE` if loading is successfully ; `FALSE` otherwise
    */
  def load(
    Descriptor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    Frame: XFrame
  ): scala.Boolean
}

