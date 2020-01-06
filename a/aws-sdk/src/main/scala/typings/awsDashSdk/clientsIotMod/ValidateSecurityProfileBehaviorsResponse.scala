package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateSecurityProfileBehaviorsResponse extends js.Object {
  /**
    * True if the behaviors were valid.
    */
  var valid: js.UndefOr[Valid] = js.native
  /**
    * The list of any errors found in the behaviors.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.native
}

object ValidateSecurityProfileBehaviorsResponse {
  @scala.inline
  def apply(valid: js.UndefOr[scala.Boolean] = js.undefined, validationErrors: ValidationErrors = null): ValidateSecurityProfileBehaviorsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateSecurityProfileBehaviorsResponse]
  }
}

