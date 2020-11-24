package typings.angularForms.mod

import typings.angularCore.mod.OnChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "MaxLengthValidator")
@js.native
class MaxLengthValidator ()
  extends Validator
     with OnChanges {
  
  var _createValidator: js.Any = js.native
  
  var _onChange: js.Any = js.native
  
  var _validator: js.Any = js.native
  
  /**
    * @description
    * Tracks changes to the the maximum length bound to this directive.
    */
  var maxlength: String | Double = js.native
  
  /**
    * Registers a callback function to call when the validator inputs change.
    * @nodoc
    */
  @JSName("registerOnValidatorChange")
  def registerOnValidatorChange_MMaxLengthValidator(fn: js.Function0[Unit]): Unit = js.native
}
