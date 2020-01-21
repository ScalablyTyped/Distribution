package typings.angularForms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "NgControl")
@js.native
abstract class NgControl () extends AbstractControlDirective {
  /**
    * @description
    * The registered async validator function for the control
    *
    * @throws An exception that this method is not implemented
    */
  val asyncValidator: AsyncValidatorFn | Null = js.native
  /**
    * @description
    * The name for the control
    */
  var name: String | Null = js.native
  /**
    * @description
    * The registered synchronous validator function for the control
    *
    * @throws An exception that this method is not implemented
    */
  val validator: ValidatorFn | Null = js.native
  /**
    * @description
    * The value accessor for the control
    */
  var valueAccessor: ControlValueAccessor | Null = js.native
  /**
    * @description
    * The callback method to update the model from the view when requested
    *
    * @param newValue The new value for the view
    */
  def viewToModelUpdate(newValue: js.Any): Unit = js.native
}

