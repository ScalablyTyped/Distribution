package typings.angularForms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncValidator extends Validator

object AsyncValidator {
  @scala.inline
  def apply(validate: AbstractControl => ValidationErrors | Null): AsyncValidator = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[AsyncValidator]
  }
}

