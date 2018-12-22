package typings
package atAngularFormsLib.srcDirectivesValidatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/src/directives/validators", "RequiredValidator")
@js.native
class RequiredValidator () extends Validator {
  var _onChange: js.Any = js.native
  var _required: js.Any = js.native
  /**
       * @description
       * Tracks changes to the required attribute bound to this directive.
       */
  var required: scala.Boolean | java.lang.String = js.native
  /**
       * @description
       * Registers a callback function to call when the validator inputs change.
       *
       * @param fn The callback function
       */
  @JSName("registerOnValidatorChange")
  def registerOnValidatorChange_MRequiredValidator(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * @description
       * Method that performs synchronous validation against the provided control.
       *
       * @param control The control to validate against.
       *
       * @returns A map of validation errors if validation fails,
       * otherwise null.
       */
  /* CompleteClass */
  override def validate(control: atAngularFormsLib.srcModelMod.AbstractControl): ValidationErrors | scala.Null = js.native
}

