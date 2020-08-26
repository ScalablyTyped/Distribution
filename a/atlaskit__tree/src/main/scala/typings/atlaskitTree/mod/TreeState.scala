package typings.atlaskitTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeState extends js.Object {
  // Id of the currently dragged item
  var draggedItemId: ItemId = js.native
  /** The flattened tree data structure transformed from props.tree */
  var flattenedTree: FlattenedTree = js.native
}

object TreeState {
  @scala.inline
  def apply(draggedItemId: ItemId, flattenedTree: FlattenedTree): TreeState = {
    val __obj = js.Dynamic.literal(draggedItemId = draggedItemId.asInstanceOf[js.Any], flattenedTree = flattenedTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeState]
  }
  @scala.inline
  implicit class TreeStateOps[Self <: TreeState] (val x: Self) extends AnyVal {
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
    def setDraggedItemId(value: ItemId): Self = this.set("draggedItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlattenedTreeVarargs(value: FlattenedItem*): Self = this.set("flattenedTree", js.Array(value :_*))
    @scala.inline
    def setFlattenedTree(value: FlattenedTree): Self = this.set("flattenedTree", value.asInstanceOf[js.Any])
  }
  
}

