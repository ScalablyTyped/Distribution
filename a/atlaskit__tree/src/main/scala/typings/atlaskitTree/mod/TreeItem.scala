package typings.atlaskitTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeItem extends js.Object {
  var children: js.Array[ItemId]
  var data: js.UndefOr[TreeItemData] = js.undefined
  var hasChildren: js.UndefOr[Boolean] = js.undefined
  var id: ItemId
  var isChildrenLoading: js.UndefOr[Boolean] = js.undefined
  var isExpanded: js.UndefOr[Boolean] = js.undefined
}

object TreeItem {
  @scala.inline
  def apply(
    children: js.Array[ItemId],
    id: ItemId,
    data: TreeItemData = null,
    hasChildren: js.UndefOr[Boolean] = js.undefined,
    isChildrenLoading: js.UndefOr[Boolean] = js.undefined,
    isExpanded: js.UndefOr[Boolean] = js.undefined
  ): TreeItem = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChildren)) __obj.updateDynamic("hasChildren")(hasChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(isChildrenLoading)) __obj.updateDynamic("isChildrenLoading")(isChildrenLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeItem]
  }
}

