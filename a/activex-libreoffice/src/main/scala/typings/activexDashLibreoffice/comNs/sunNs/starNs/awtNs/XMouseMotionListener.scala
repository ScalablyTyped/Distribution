package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive mouse motion events on a window. */
trait XMouseMotionListener extends XEventListener {
  /**
    * is invoked when a mouse button is pressed on a window and then dragged.
    *
    * Mouse drag events will continue to be delivered to the window where the first event originated until the mouse button is released (regardless of
    * whether the mouse position is within the bounds of the window).
    */
  def mouseDragged(e: MouseEvent): Unit
  /** is invoked when the mouse pointer has been moved on a window (with no buttons down). */
  def mouseMoved(e: MouseEvent): Unit
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
}

