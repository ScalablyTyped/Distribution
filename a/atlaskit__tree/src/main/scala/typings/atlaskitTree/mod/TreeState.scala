package typings.atlaskitTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeState extends js.Object {
  // Id of the currently dragged item
  var draggedItemId: ItemId
  /** The flattened tree data structure transformed from props.tree */
  var flattenedTree: FlattenedTree
}

object TreeState {
  @scala.inline
  def apply(draggedItemId: ItemId, flattenedTree: FlattenedTree): TreeState = {
    val __obj = js.Dynamic.literal(draggedItemId = draggedItemId.asInstanceOf[js.Any], flattenedTree = flattenedTree.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TreeState]
  }
}

