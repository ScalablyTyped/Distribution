package typings.asn1js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsIndefiniteForm extends js.Object {
  var isIndefiniteForm: js.UndefOr[Boolean] = js.undefined
  var length: Double
  var longFormUsed: js.UndefOr[Boolean] = js.undefined
}

object AnonIsIndefiniteForm {
  @scala.inline
  def apply(
    length: Double,
    isIndefiniteForm: js.UndefOr[Boolean] = js.undefined,
    longFormUsed: js.UndefOr[Boolean] = js.undefined
  ): AnonIsIndefiniteForm = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (!js.isUndefined(isIndefiniteForm)) __obj.updateDynamic("isIndefiniteForm")(isIndefiniteForm.asInstanceOf[js.Any])
    if (!js.isUndefined(longFormUsed)) __obj.updateDynamic("longFormUsed")(longFormUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsIndefiniteForm]
  }
}

