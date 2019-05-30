package typings
package atAngularFormsLib.atAngularFormsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractControlOptions extends js.Object {
  /**
    * @description
    * The list of async validators applied to control.
    */
  var asyncValidators: js.UndefOr[AsyncValidatorFn | js.Array[AsyncValidatorFn] | scala.Null] = js.undefined
  /**
    * @description
    * The event name for control to update upon.
    */
  var updateOn: js.UndefOr[
    atAngularFormsLib.atAngularFormsLibStrings.change | atAngularFormsLib.atAngularFormsLibStrings.blur | atAngularFormsLib.atAngularFormsLibStrings.submit
  ] = js.undefined
  /**
    * @description
    * The list of validators applied to a control.
    */
  var validators: js.UndefOr[ValidatorFn | js.Array[ValidatorFn] | scala.Null] = js.undefined
}

object AbstractControlOptions {
  @scala.inline
  def apply(
    asyncValidators: AsyncValidatorFn | js.Array[AsyncValidatorFn] = null,
    updateOn: atAngularFormsLib.atAngularFormsLibStrings.change | atAngularFormsLib.atAngularFormsLibStrings.blur | atAngularFormsLib.atAngularFormsLibStrings.submit = null,
    validators: ValidatorFn | js.Array[ValidatorFn] = null
  ): AbstractControlOptions = {
    val __obj = js.Dynamic.literal()
    if (asyncValidators != null) __obj.updateDynamic("asyncValidators")(asyncValidators.asInstanceOf[js.Any])
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractControlOptions]
  }
}

