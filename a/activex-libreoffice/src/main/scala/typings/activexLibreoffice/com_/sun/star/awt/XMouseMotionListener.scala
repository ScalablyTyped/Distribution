package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive mouse motion events on a window. */
@js.native
trait XMouseMotionListener extends XEventListener {
  /**
    * is invoked when a mouse button is pressed on a window and then dragged.
    *
    * Mouse drag events will continue to be delivered to the window where the first event originated until the mouse button is released (regardless of
    * whether the mouse position is within the bounds of the window).
    */
  def mouseDragged(e: MouseEvent): Unit = js.native
  /** is invoked when the mouse pointer has been moved on a window (with no buttons down). */
  def mouseMoved(e: MouseEvent): Unit = js.native
}

object XMouseMotionListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    mouseDragged: MouseEvent => Unit,
    mouseMoved: MouseEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMouseMotionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), mouseDragged = js.Any.fromFunction1(mouseDragged), mouseMoved = js.Any.fromFunction1(mouseMoved), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMouseMotionListener]
  }
  @scala.inline
  implicit class XMouseMotionListenerOps[Self <: XMouseMotionListener] (val x: Self) extends AnyVal {
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
    def setMouseDragged(value: MouseEvent => Unit): Self = this.set("mouseDragged", js.Any.fromFunction1(value))
    @scala.inline
    def setMouseMoved(value: MouseEvent => Unit): Self = this.set("mouseMoved", js.Any.fromFunction1(value))
  }
  
}

