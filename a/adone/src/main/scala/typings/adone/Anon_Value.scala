package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Value extends js.Object {
  var value: js.UndefOr[Boolean] = js.undefined
}

object Anon_Value {
  @scala.inline
  def apply(value: js.UndefOr[Boolean] = js.undefined): Anon_Value = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Value]
  }
}

