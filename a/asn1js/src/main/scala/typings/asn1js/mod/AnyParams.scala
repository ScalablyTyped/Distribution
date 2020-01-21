package typings.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyParams extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
}

object AnyParams {
  @scala.inline
  def apply(name: String = null, optional: js.UndefOr[scala.Boolean] = js.undefined): AnyParams = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyParams]
  }
}

