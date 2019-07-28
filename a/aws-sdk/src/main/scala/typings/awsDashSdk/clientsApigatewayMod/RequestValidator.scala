package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestValidator extends js.Object {
  /**
    * The identifier of this RequestValidator.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The name of this RequestValidator
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A Boolean flag to indicate whether to validate a request body according to the configured Model schema.
    */
  var validateRequestBody: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean flag to indicate whether to validate request parameters (true) or not (false).
    */
  var validateRequestParameters: js.UndefOr[Boolean] = js.undefined
}

object RequestValidator {
  @scala.inline
  def apply(
    id: String = null,
    name: String = null,
    validateRequestBody: js.UndefOr[Boolean] = js.undefined,
    validateRequestParameters: js.UndefOr[Boolean] = js.undefined
  ): RequestValidator = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(validateRequestBody)) __obj.updateDynamic("validateRequestBody")(validateRequestBody)
    if (!js.isUndefined(validateRequestParameters)) __obj.updateDynamic("validateRequestParameters")(validateRequestParameters)
    __obj.asInstanceOf[RequestValidator]
  }
}

