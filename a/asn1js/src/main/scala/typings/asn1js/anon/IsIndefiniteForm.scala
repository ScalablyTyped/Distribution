package typings.asn1js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsIndefiniteForm extends js.Object {
  var isIndefiniteForm: js.UndefOr[Boolean] = js.undefined
  var length: Double
  var longFormUsed: js.UndefOr[Boolean] = js.undefined
}

object IsIndefiniteForm {
  @scala.inline
  def apply(
    length: Double,
    isIndefiniteForm: js.UndefOr[Boolean] = js.undefined,
    longFormUsed: js.UndefOr[Boolean] = js.undefined
  ): IsIndefiniteForm = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (!js.isUndefined(isIndefiniteForm)) __obj.updateDynamic("isIndefiniteForm")(isIndefiniteForm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longFormUsed)) __obj.updateDynamic("longFormUsed")(longFormUsed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsIndefiniteForm]
  }
}

