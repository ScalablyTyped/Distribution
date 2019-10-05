package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRequestValidatorRequest extends js.Object {
  /**
    * The name of the to-be-created RequestValidator.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * A Boolean flag to indicate whether to validate request body according to the configured model schema for the method (true) or not (false).
    */
  var validateRequestBody: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean flag to indicate whether to validate request parameters, true, or not false.
    */
  var validateRequestParameters: js.UndefOr[Boolean] = js.undefined
}

object CreateRequestValidatorRequest {
  @scala.inline
  def apply(
    restApiId: String,
    name: String = null,
    validateRequestBody: js.UndefOr[scala.Boolean] = js.undefined,
    validateRequestParameters: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateRequestValidatorRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(validateRequestBody)) __obj.updateDynamic("validateRequestBody")(validateRequestBody)
    if (!js.isUndefined(validateRequestParameters)) __obj.updateDynamic("validateRequestParameters")(validateRequestParameters)
    __obj.asInstanceOf[CreateRequestValidatorRequest]
  }
}

