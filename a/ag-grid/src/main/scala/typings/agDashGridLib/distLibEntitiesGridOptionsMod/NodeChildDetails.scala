package typings
package agDashGridLib.distLibEntitiesGridOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeChildDetails extends js.Object {
  var children: js.UndefOr[js.Array[_]] = js.undefined
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var group: scala.Boolean
  var key: js.UndefOr[js.Any] = js.undefined
}

object NodeChildDetails {
  @scala.inline
  def apply(
    group: scala.Boolean,
    children: js.Array[_] = null,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    field: java.lang.String = null,
    key: js.Any = null
  ): NodeChildDetails = {
    val __obj = js.Dynamic.literal(group = group)
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (field != null) __obj.updateDynamic("field")(field)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[NodeChildDetails]
  }
}

