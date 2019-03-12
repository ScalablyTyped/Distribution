package typings
package atAtlaskitTreeLib.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderItemParams extends js.Object {
  var depth: scala.Double
  var item: TreeItem
  var provided: TreeDraggableProvided
  var snapshot: reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod.DraggableStateSnapshot
  def onCollapse(itemId: ItemId): scala.Unit
  def onExpand(itemId: ItemId): scala.Unit
}

object RenderItemParams {
  @scala.inline
  def apply(
    depth: scala.Double,
    item: TreeItem,
    onCollapse: ItemId => scala.Unit,
    onExpand: ItemId => scala.Unit,
    provided: TreeDraggableProvided,
    snapshot: reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod.DraggableStateSnapshot
  ): RenderItemParams = {
    val __obj = js.Dynamic.literal(depth = depth, item = item, onCollapse = js.Any.fromFunction1(onCollapse), onExpand = js.Any.fromFunction1(onExpand), provided = provided, snapshot = snapshot)
  
    __obj.asInstanceOf[RenderItemParams]
  }
}

