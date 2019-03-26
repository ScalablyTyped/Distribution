package typings
package agDashGridLib.distLibDragAndDropDragServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragListenerParams extends js.Object {
  /** After how many pixels of dragging should the drag operation start. Default is 4px. */
  var dragStartPixels: js.UndefOr[scala.Double] = js.native
  /** Dom element to add the drag handling to */
  var eElement: stdLib.HTMLElement = js.native
  /** Some places may wish to ignore certain events, eg range selection ignores shift clicks */
  var skipMouseEvent: js.UndefOr[js.Function1[/* mouseEvent */ stdLib.MouseEvent, scala.Boolean]] = js.native
  /** Callback for drag starting */
  def onDragStart(mouseEvent: stdLib.MouseEvent): scala.Unit = js.native
  def onDragStart(mouseEvent: stdLib.Touch): scala.Unit = js.native
  /** Callback for drag stopping */
  def onDragStop(mouseEvent: stdLib.MouseEvent): scala.Unit = js.native
  def onDragStop(mouseEvent: stdLib.Touch): scala.Unit = js.native
  /** Callback for mouse move while dragging */
  def onDragging(mouseEvent: stdLib.MouseEvent): scala.Unit = js.native
  def onDragging(mouseEvent: stdLib.Touch): scala.Unit = js.native
}

