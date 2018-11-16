package typings
package atAngularFormsLib.srcDirectivesValidatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/src/directives/validators", "EmailValidator")
@js.native
class EmailValidator () extends Validator {
  var _enabled: js.Any = js.native
  var _onChange: js.Any = js.native
  var email: scala.Boolean | java.lang.String = js.native
  @JSName("registerOnValidatorChange")
  def registerOnValidatorChange_MEmailValidator(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * @description
       * Method that performs synchronous validation against the provided control.
       *
       * @param c The control to validate against.
       *
       * @returns A map of validation errors if validation fails,
       * otherwise null.
       */
  /* CompleteClass */
  override def validate(control: atAngularFormsLib.srcModelMod.AbstractControl): ValidationErrors | scala.Null = js.native
}

