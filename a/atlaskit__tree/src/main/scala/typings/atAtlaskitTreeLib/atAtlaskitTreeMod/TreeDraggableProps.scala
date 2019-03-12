package typings
package atAtlaskitTreeLib.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeDraggableProps extends js.Object {
  // used for shared global styles
  var `data-react-beautiful-dnd-draggable`: java.lang.String
  // Props that can be spread onto the element directly
  // inline style
  var style: js.UndefOr[atAtlaskitTreeLib.TreeDraggableStyle] = js.undefined
}

object TreeDraggableProps {
  @scala.inline
  def apply(
    `data-react-beautiful-dnd-draggable`: java.lang.String,
    style: atAtlaskitTreeLib.TreeDraggableStyle = null
  ): TreeDraggableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-react-beautiful-dnd-draggable")(`data-react-beautiful-dnd-draggable`)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TreeDraggableProps]
  }
}

