package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Value extends js.Object {
  var value: js.UndefOr[scala.Nothing] = js.undefined
  var value12hours: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_Value {
  @scala.inline
  def apply(
    value: js.UndefOr[scala.Nothing] = js.undefined,
    value12hours: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_Value = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(value12hours)) __obj.updateDynamic("value12hours")(value12hours.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Value]
  }
}

