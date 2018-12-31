package typings
package atAngularFormsLib.srcDirectivesNgUnderscoreControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/src/directives/ng_control", "NgControl")
@js.native
abstract class NgControl ()
  extends atAngularFormsLib.srcDirectivesAbstractUnderscoreControlUnderscoreDirectiveMod.AbstractControlDirective {
  /**
    * @description
    * The registered async validator function for the control
    *
    * @throws An exception that this method is not implemented
    */
  val asyncValidator: atAngularFormsLib.srcDirectivesValidatorsMod.AsyncValidatorFn | scala.Null = js.native
  /**
    * @description
    * The name for the control
    */
  var name: java.lang.String | scala.Null = js.native
  /**
    * @description
    * The registered synchronous validator function for the control
    *
    * @throws An exception that this method is not implemented
    */
  val validator: atAngularFormsLib.srcDirectivesValidatorsMod.ValidatorFn | scala.Null = js.native
  /**
    * @description
    * The value accessor for the control
    */
  var valueAccessor: atAngularFormsLib.srcDirectivesControlUnderscoreValueUnderscoreAccessorMod.ControlValueAccessor | scala.Null = js.native
  /**
    * @description
    * The callback method to update the model from the view when requested
    *
    * @param newValue The new value for the view
    */
  def viewToModelUpdate(newValue: js.Any): scala.Unit = js.native
}

