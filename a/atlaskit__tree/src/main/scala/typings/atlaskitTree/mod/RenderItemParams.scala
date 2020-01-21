package typings.atlaskitTree.mod

import typings.reactBeautifulDnd.mod.DraggableStateSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderItemParams extends js.Object {
  var depth: Double
  var item: TreeItem
  var provided: TreeDraggableProvided
  var snapshot: DraggableStateSnapshot
  def onCollapse(itemId: ItemId): Unit
  def onExpand(itemId: ItemId): Unit
}

object RenderItemParams {
  @scala.inline
  def apply(
    depth: Double,
    item: TreeItem,
    onCollapse: ItemId => Unit,
    onExpand: ItemId => Unit,
    provided: TreeDraggableProvided,
    snapshot: DraggableStateSnapshot
  ): RenderItemParams = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction1(onCollapse), onExpand = js.Any.fromFunction1(onExpand), provided = provided.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderItemParams]
  }
}

