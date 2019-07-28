package typings.asn1js.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatedParams extends js.Object {
  var local: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[Any] = js.undefined
}

object RepeatedParams {
  @scala.inline
  def apply(
    local: js.UndefOr[scala.Boolean] = js.undefined,
    name: String = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    value: Any = null
  ): RepeatedParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RepeatedParams]
  }
}

