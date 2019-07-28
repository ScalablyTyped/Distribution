package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsIndefiniteForm extends js.Object {
  var isIndefiniteForm: js.UndefOr[Boolean] = js.undefined
  var length: Double
  var longFormUsed: js.UndefOr[Boolean] = js.undefined
}

object Anon_IsIndefiniteForm {
  @scala.inline
  def apply(
    length: Double,
    isIndefiniteForm: js.UndefOr[Boolean] = js.undefined,
    longFormUsed: js.UndefOr[Boolean] = js.undefined
  ): Anon_IsIndefiniteForm = {
    val __obj = js.Dynamic.literal(length = length)
    if (!js.isUndefined(isIndefiniteForm)) __obj.updateDynamic("isIndefiniteForm")(isIndefiniteForm)
    if (!js.isUndefined(longFormUsed)) __obj.updateDynamic("longFormUsed")(longFormUsed)
    __obj.asInstanceOf[Anon_IsIndefiniteForm]
  }
}

