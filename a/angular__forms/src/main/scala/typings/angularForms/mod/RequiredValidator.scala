package typings.angularForms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "RequiredValidator")
@js.native
class RequiredValidator () extends Validator {
  var _onChange: js.Any = js.native
  var _required: js.Any = js.native
  /**
    * @description
    * Registers a callback function to call when the validator inputs change.
    *
    * @param fn The callback function
    */
  @JSName("registerOnValidatorChange")
  def registerOnValidatorChange_MRequiredValidator(fn: js.Function0[Unit]): Unit = js.native
  /**
    * @description
    * Tracks changes to the required attribute bound to this directive.
    */
  def required: Boolean | String = js.native
  def required_=(value: Boolean | String): Unit = js.native
}

