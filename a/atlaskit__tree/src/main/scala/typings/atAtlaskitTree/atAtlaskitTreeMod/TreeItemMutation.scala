package typings.atAtlaskitTree.atAtlaskitTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeItemMutation extends js.Object {
  var children: js.UndefOr[js.Array[ItemId]] = js.undefined
  var data: js.UndefOr[TreeItemData] = js.undefined
  var hasChildren: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[ItemId] = js.undefined
  var isChildrenLoading: js.UndefOr[Boolean] = js.undefined
  var isExpanded: js.UndefOr[Boolean] = js.undefined
}

object TreeItemMutation {
  @scala.inline
  def apply(
    children: js.Array[ItemId] = null,
    data: TreeItemData = null,
    hasChildren: js.UndefOr[Boolean] = js.undefined,
    id: ItemId = null,
    isChildrenLoading: js.UndefOr[Boolean] = js.undefined,
    isExpanded: js.UndefOr[Boolean] = js.undefined
  ): TreeItemMutation = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChildren)) __obj.updateDynamic("hasChildren")(hasChildren.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isChildrenLoading)) __obj.updateDynamic("isChildrenLoading")(isChildrenLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeItemMutation]
  }
}

