package typings.angularForms.mod

import typings.angularCore.mod.OnChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "MinLengthValidator")
@js.native
class MinLengthValidator ()
  extends Validator
     with OnChanges {
  var _createValidator: js.Any = js.native
  var _onChange: js.Any = js.native
  var _validator: js.Any = js.native
  /**
    * @description
    * Tracks changes to the the minimum length bound to this directive.
    */
  var minlength: String | Double = js.native
  /**
    * @description
    * Registers a callback function to call when the validator inputs change.
    *
    * @param fn The callback function
    */
  @JSName("registerOnValidatorChange")
  def registerOnValidatorChange_MMinLengthValidator(fn: js.Function0[Unit]): Unit = js.native
}

