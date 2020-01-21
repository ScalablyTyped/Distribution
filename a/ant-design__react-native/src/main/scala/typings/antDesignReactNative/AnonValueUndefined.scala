package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueUndefined extends js.Object {
  var value: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonValueUndefined {
  @scala.inline
  def apply(value: js.UndefOr[scala.Nothing] = js.undefined): AnonValueUndefined = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValueUndefined]
  }
}

