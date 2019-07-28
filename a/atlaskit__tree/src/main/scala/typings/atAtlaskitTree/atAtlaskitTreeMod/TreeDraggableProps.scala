package typings.atAtlaskitTree.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeDraggableProps extends js.Object {
  // used for shared global styles
  var `data-react-beautiful-dnd-draggable`: String
  // Props that can be spread onto the element directly
  // inline style
  var style: js.UndefOr[TreeDraggableStyle] = js.undefined
}

object TreeDraggableProps {
  @scala.inline
  def apply(`data-react-beautiful-dnd-draggable`: String, style: TreeDraggableStyle = null): TreeDraggableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-react-beautiful-dnd-draggable")(`data-react-beautiful-dnd-draggable`)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeDraggableProps]
  }
}

