package typings
package atAngularFormsLib.srcDirectivesValidatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncValidator extends Validator

object AsyncValidator {
  @scala.inline
  def apply(
    validate: atAngularFormsLib.srcModelMod.AbstractControl => (js.Promise[ValidationErrors | scala.Null]) | (rxjsLib.rxjsMod.Observable[ValidationErrors | scala.Null]),
    registerOnValidatorChange: /* fn */ js.Function0[scala.Unit] => scala.Unit = null
  ): AsyncValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    if (registerOnValidatorChange != null) __obj.updateDynamic("registerOnValidatorChange")(js.Any.fromFunction1(registerOnValidatorChange))
    __obj.asInstanceOf[AsyncValidator]
  }
}

