package typings.atAtlaskitTree.atAtlaskitTreeMod

import typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod.DraggableStateSnapshot
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
    val __obj = js.Dynamic.literal(depth = depth, item = item, onCollapse = js.Any.fromFunction1(onCollapse), onExpand = js.Any.fromFunction1(onExpand), provided = provided, snapshot = snapshot)
  
    __obj.asInstanceOf[RenderItemParams]
  }
}

