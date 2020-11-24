package typings.agGrid.dragAndDropServiceMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropTarget extends js.Object {
  
  /** The main container that will get the drop. */
  def getContainer(): HTMLElement = js.native
  
  /** Icon to show when drag is over*/
  var getIconName: js.UndefOr[js.Function0[String]] = js.native
  
  /** If any secondary containers. For example when moving columns in ag-Grid, we listen for drops
    * in the header as well as the body (main rows and pinned rows) of the grid. */
  var getSecondaryContainers: js.UndefOr[js.Function0[js.Array[HTMLElement]]] = js.native
  
  def isInterestedIn(`type`: DragSourceType): Boolean = js.native
  
  /** Callback for when drag enters */
  var onDragEnter: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.native
  
  /** Callback for when drag leaves */
  var onDragLeave: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.native
  
  /** Callback for when drag stops */
  var onDragStop: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.native
  
  /** Callback for when dragging */
  var onDragging: js.UndefOr[js.Function1[/* params */ DraggingEvent, Unit]] = js.native
}
object DropTarget {
  
  @scala.inline
  def apply(getContainer: () => HTMLElement, isInterestedIn: DragSourceType => Boolean): DropTarget = {
    val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer), isInterestedIn = js.Any.fromFunction1(isInterestedIn))
    __obj.asInstanceOf[DropTarget]
  }
  
  @scala.inline
  implicit class DropTargetOps[Self <: DropTarget] (val x: Self) extends AnyVal {
    
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
    def setGetContainer(value: () => HTMLElement): Self = this.set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInterestedIn(value: DragSourceType => Boolean): Self = this.set("isInterestedIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetIconName(value: () => String): Self = this.set("getIconName", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetIconName: Self = this.set("getIconName", js.undefined)
    
    @scala.inline
    def setGetSecondaryContainers(value: () => js.Array[HTMLElement]): Self = this.set("getSecondaryContainers", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSecondaryContainers: Self = this.set("getSecondaryContainers", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: /* params */ DraggingEvent => Unit): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: /* params */ DraggingEvent => Unit): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragStop(value: /* params */ DraggingEvent => Unit): Self = this.set("onDragStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStop: Self = this.set("onDragStop", js.undefined)
    
    @scala.inline
    def setOnDragging(value: /* params */ DraggingEvent => Unit): Self = this.set("onDragging", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragging: Self = this.set("onDragging", js.undefined)
  }
}
