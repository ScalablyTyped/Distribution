package typings.agGrid.gridOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeChildDetails extends js.Object {
  var children: js.UndefOr[js.Array[_]] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var group: Boolean
  var key: js.UndefOr[js.Any] = js.undefined
}

object NodeChildDetails {
  @scala.inline
  def apply(
    group: Boolean,
    children: js.Array[_] = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    key: js.Any = null
  ): NodeChildDetails = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.get.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeChildDetails]
  }
}

