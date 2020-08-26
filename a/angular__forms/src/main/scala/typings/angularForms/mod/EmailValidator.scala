package typings.angularForms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "EmailValidator")
@js.native
class EmailValidator () extends Validator {
  var _enabled: js.Any = js.native
  var _onChange: js.Any = js.native
  /**
    * @description
    * Tracks changes to the email attribute bound to this directive.
    */
  def email_=(value: Boolean | String): Unit = js.native
  /**
    * @description
    * Registers a callback function to call when the validator inputs change.
    *
    * @param fn The callback function
    */
  @JSName("registerOnValidatorChange")
  def registerOnValidatorChange_MEmailValidator(fn: js.Function0[Unit]): Unit = js.native
}

