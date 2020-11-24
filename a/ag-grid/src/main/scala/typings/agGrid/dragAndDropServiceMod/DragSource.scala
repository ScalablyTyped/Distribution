package typings.agGrid.dragAndDropServiceMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragSource extends js.Object {
  
  /** If eElement is dragged, then the dragItem is the object that gets passed around. */
  def dragItemCallback(): DragItem = js.native
  
  /** This name appears in the ghost icon when dragging */
  var dragItemName: String = js.native
  
  /** The drop target associated with this dragSource. So when dragging starts, this target does not get
    * onDragEnter event. */
  var dragSourceDropTarget: js.UndefOr[DropTarget] = js.native
  
  /** After how many pixels of dragging should the drag operation start. Default is 4px. */
  var dragStartPixels: js.UndefOr[Double] = js.native
  
  /** Callback for drag started */
  var dragStarted: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Callback for drag stopped */
  var dragStopped: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Element which, when dragged, will kick off the DnD process */
  var eElement: HTMLElement = js.native
  
  /** So the drop target knows what type of event it is, useful for columns,
    * we we re-ordering or moving dropping from toolPanel */
  var `type`: DragSourceType = js.native
}
object DragSource {
  
  @scala.inline
  def apply(
    dragItemCallback: () => DragItem,
    dragItemName: String,
    eElement: HTMLElement,
    `type`: DragSourceType
  ): DragSource = {
    val __obj = js.Dynamic.literal(dragItemCallback = js.Any.fromFunction0(dragItemCallback), dragItemName = dragItemName.asInstanceOf[js.Any], eElement = eElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragSource]
  }
  
  @scala.inline
  implicit class DragSourceOps[Self <: DragSource] (val x: Self) extends AnyVal {
    
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
    def setDragItemCallback(value: () => DragItem): Self = this.set("dragItemCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDragItemName(value: String): Self = this.set("dragItemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEElement(value: HTMLElement): Self = this.set("eElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DragSourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragSourceDropTarget(value: DropTarget): Self = this.set("dragSourceDropTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragSourceDropTarget: Self = this.set("dragSourceDropTarget", js.undefined)
    
    @scala.inline
    def setDragStartPixels(value: Double): Self = this.set("dragStartPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragStartPixels: Self = this.set("dragStartPixels", js.undefined)
    
    @scala.inline
    def setDragStarted(value: () => Unit): Self = this.set("dragStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDragStarted: Self = this.set("dragStarted", js.undefined)
    
    @scala.inline
    def setDragStopped(value: () => Unit): Self = this.set("dragStopped", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDragStopped: Self = this.set("dragStopped", js.undefined)
  }
}
