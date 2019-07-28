package typings.atAngularForms.atAngularFormsMod

import typings.atAngularCore.atAngularCoreMod.OnChanges
import typings.atAngularCore.atAngularCoreMod.SimpleChanges
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "PatternValidator")
@js.native
class PatternValidator ()
  extends Validator
     with OnChanges {
  var _createValidator: js.Any = js.native
  var _onChange: js.Any = js.native
  var _validator: js.Any = js.native
  /**
    * @description
    * Tracks changes to the pattern bound to this directive.
    */
  var pattern: String | RegExp = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  /**
    * @description
    * Registers a callback function to call when the validator inputs change.
    *
    * @param fn The callback function
    */
  @JSName("registerOnValidatorChange")
  def registerOnValidatorChange_MPatternValidator(fn: js.Function0[Unit]): Unit = js.native
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
  override def validate(control: AbstractControl): ValidationErrors | Null = js.native
}

