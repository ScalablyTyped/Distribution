package typings.agGrid.dragAndDropServiceMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragSource extends js.Object {
  /** This name appears in the ghost icon when dragging */
  var dragItemName: String
  /** The drop target associated with this dragSource. So when dragging starts, this target does not get
    * onDragEnter event. */
  var dragSourceDropTarget: js.UndefOr[DropTarget] = js.undefined
  /** After how many pixels of dragging should the drag operation start. Default is 4px. */
  var dragStartPixels: js.UndefOr[Double] = js.undefined
  /** Callback for drag started */
  var dragStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Callback for drag stopped */
  var dragStopped: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Element which, when dragged, will kick off the DnD process */
  var eElement: HTMLElement
  /** So the drop target knows what type of event it is, useful for columns,
    * we we re-ordering or moving dropping from toolPanel */
  var `type`: DragSourceType
  /** If eElement is dragged, then the dragItem is the object that gets passed around. */
  def dragItemCallback(): DragItem
}

object DragSource {
  @scala.inline
  def apply(
    dragItemCallback: () => DragItem,
    dragItemName: String,
    eElement: HTMLElement,
    `type`: DragSourceType,
    dragSourceDropTarget: DropTarget = null,
    dragStartPixels: js.UndefOr[Double] = js.undefined,
    dragStarted: () => Unit = null,
    dragStopped: () => Unit = null
  ): DragSource = {
    val __obj = js.Dynamic.literal(dragItemCallback = js.Any.fromFunction0(dragItemCallback), dragItemName = dragItemName.asInstanceOf[js.Any], eElement = eElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dragSourceDropTarget != null) __obj.updateDynamic("dragSourceDropTarget")(dragSourceDropTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(dragStartPixels)) __obj.updateDynamic("dragStartPixels")(dragStartPixels.get.asInstanceOf[js.Any])
    if (dragStarted != null) __obj.updateDynamic("dragStarted")(js.Any.fromFunction0(dragStarted))
    if (dragStopped != null) __obj.updateDynamic("dragStopped")(js.Any.fromFunction0(dragStopped))
    __obj.asInstanceOf[DragSource]
  }
}

