package typings.angularForms.mod

import typings.angularForms.angularFormsStrings.blur
import typings.angularForms.angularFormsStrings.change
import typings.angularForms.angularFormsStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractControlOptions extends js.Object {
  /**
    * @description
    * The list of async validators applied to control.
    */
  var asyncValidators: js.UndefOr[AsyncValidatorFn | js.Array[AsyncValidatorFn] | Null] = js.undefined
  /**
    * @description
    * The event name for control to update upon.
    */
  var updateOn: js.UndefOr[change | blur | submit] = js.undefined
  /**
    * @description
    * The list of validators applied to a control.
    */
  var validators: js.UndefOr[ValidatorFn | js.Array[ValidatorFn] | Null] = js.undefined
}

object AbstractControlOptions {
  @scala.inline
  def apply(
    asyncValidators: js.UndefOr[Null | AsyncValidatorFn | js.Array[AsyncValidatorFn]] = js.undefined,
    updateOn: change | blur | submit = null,
    validators: js.UndefOr[Null | ValidatorFn | js.Array[ValidatorFn]] = js.undefined
  ): AbstractControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asyncValidators)) __obj.updateDynamic("asyncValidators")(asyncValidators.asInstanceOf[js.Any])
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn.asInstanceOf[js.Any])
    if (!js.isUndefined(validators)) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractControlOptions]
  }
}

