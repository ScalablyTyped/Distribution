package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestValidator extends js.Object {
  /**
    * The identifier of this RequestValidator.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The name of this RequestValidator
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A Boolean flag to indicate whether to validate a request body according to the configured Model schema.
    */
  var validateRequestBody: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean flag to indicate whether to validate request parameters (true) or not (false).
    */
  var validateRequestParameters: js.UndefOr[Boolean] = js.native
}

object RequestValidator {
  @scala.inline
  def apply(
    id: String = null,
    name: String = null,
    validateRequestBody: js.UndefOr[scala.Boolean] = js.undefined,
    validateRequestParameters: js.UndefOr[scala.Boolean] = js.undefined
  ): RequestValidator = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(validateRequestBody)) __obj.updateDynamic("validateRequestBody")(validateRequestBody.asInstanceOf[js.Any])
    if (!js.isUndefined(validateRequestParameters)) __obj.updateDynamic("validateRequestParameters")(validateRequestParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestValidator]
  }
}

