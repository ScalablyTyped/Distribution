package typings
package atAtlaskitTreeLib.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeItem extends js.Object {
  var children: js.Array[ItemId]
  var data: js.UndefOr[TreeItemData] = js.undefined
  var hasChildren: js.UndefOr[scala.Boolean] = js.undefined
  var id: ItemId
  var isChildrenLoading: js.UndefOr[scala.Boolean] = js.undefined
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
}

object TreeItem {
  @scala.inline
  def apply(
    children: js.Array[ItemId],
    id: ItemId,
    data: TreeItemData = null,
    hasChildren: js.UndefOr[scala.Boolean] = js.undefined,
    isChildrenLoading: js.UndefOr[scala.Boolean] = js.undefined,
    isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  ): TreeItem = {
    val __obj = js.Dynamic.literal(children = children, id = id)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(hasChildren)) __obj.updateDynamic("hasChildren")(hasChildren)
    if (!js.isUndefined(isChildrenLoading)) __obj.updateDynamic("isChildrenLoading")(isChildrenLoading)
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    __obj.asInstanceOf[TreeItem]
  }
}

