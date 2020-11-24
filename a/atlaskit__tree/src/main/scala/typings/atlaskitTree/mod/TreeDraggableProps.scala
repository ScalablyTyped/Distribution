package typings.atlaskitTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeDraggableProps extends js.Object {
  
  // used for shared global styles
  var `data-react-beautiful-dnd-draggable`: String = js.native
  
  // Props that can be spread onto the element directly
  // inline style
  var style: js.UndefOr[TreeDraggableStyle] = js.native
}
object TreeDraggableProps {
  
  @scala.inline
  def apply(`data-react-beautiful-dnd-draggable`: String): TreeDraggableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-react-beautiful-dnd-draggable")(`data-react-beautiful-dnd-draggable`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeDraggableProps]
  }
  
  @scala.inline
  implicit class TreeDraggablePropsOps[Self <: TreeDraggableProps] (val x: Self) extends AnyVal {
    
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
    def `setData-react-beautiful-dnd-draggable`(value: String): Self = this.set("data-react-beautiful-dnd-draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: TreeDraggableStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
