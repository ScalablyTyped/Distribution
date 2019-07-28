package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateSecurityProfileBehaviorsResponse extends js.Object {
  /**
    * True if the behaviors were valid.
    */
  var valid: js.UndefOr[Valid] = js.undefined
  /**
    * The list of any errors found in the behaviors.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.undefined
}

object ValidateSecurityProfileBehaviorsResponse {
  @scala.inline
  def apply(valid: js.UndefOr[Valid] = js.undefined, validationErrors: ValidationErrors = null): ValidateSecurityProfileBehaviorsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors)
    __obj.asInstanceOf[ValidateSecurityProfileBehaviorsResponse]
  }
}

