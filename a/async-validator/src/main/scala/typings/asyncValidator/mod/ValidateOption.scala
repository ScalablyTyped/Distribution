package typings.asyncValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateOption extends js.Object {
  // when the first validation rule generates an error stop processed
  var first: js.UndefOr[Boolean] = js.undefined
  // when the first validation rule of the specified field generates an error stop the field processed, 'true' means all fields.
  var firstFields: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  // whether to suppress internal warning
  var suppressWarning: js.UndefOr[Boolean] = js.undefined
}

object ValidateOption {
  @scala.inline
  def apply(
    first: js.UndefOr[Boolean] = js.undefined,
    firstFields: Boolean | js.Array[String] = null,
    suppressWarning: js.UndefOr[Boolean] = js.undefined
  ): ValidateOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (firstFields != null) __obj.updateDynamic("firstFields")(firstFields.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressWarning)) __obj.updateDynamic("suppressWarning")(suppressWarning.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateOption]
  }
}

