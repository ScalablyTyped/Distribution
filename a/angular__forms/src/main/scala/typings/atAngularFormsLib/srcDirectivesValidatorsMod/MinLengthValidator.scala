package typings
package atAngularFormsLib.srcDirectivesValidatorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/src/directives/validators", "MinLengthValidator")
@js.native
class MinLengthValidator ()
  extends Validator
     with atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.OnChanges {
  var _createValidator: js.Any = js.native
  var _onChange: js.Any = js.native
  var _validator: js.Any = js.native
  var minlength: java.lang.String = js.native
  /**
       * A callback method that is invoked immediately after the
       * default change detector has checked data-bound properties
       * if at least one has changed, and before the view and content
       * children are checked.
       * @param changes The changed properties.
       */
  /* CompleteClass */
  override def ngOnChanges(changes: atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.SimpleChanges): scala.Unit = js.native
  @JSName("registerOnValidatorChange")
  def registerOnValidatorChange_MMinLengthValidator(fn: js.Function0[scala.Unit]): scala.Unit = js.native
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

