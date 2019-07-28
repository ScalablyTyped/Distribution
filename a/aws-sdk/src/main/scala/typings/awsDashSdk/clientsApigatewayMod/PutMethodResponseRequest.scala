package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutMethodResponseRequest extends js.Object {
  /**
    * [Required] The HTTP verb of the Method resource.
    */
  var httpMethod: String
  /**
    * [Required] The Resource identifier for the Method resource.
    */
  var resourceId: String
  /**
    * Specifies the Model resources used for the response's content type. Response models are represented as a key/value map, with a content type as the key and a Model name as the value.
    */
  var responseModels: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * A key-value map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header name and the associated value is a Boolean flag indicating whether the method response parameter is required or not. The method response header names must match the pattern of method.response.header.{name}, where name is a valid and unique header name. The response parameter names defined here are available in the integration response to be mapped from an integration response header expressed in integration.response.header.{name}, a static value enclosed within a pair of single quotes (e.g., 'application/json'), or a JSON expression from the back-end response payload in the form of integration.response.body.{JSON-expression}, where JSON-expression is a valid JSON expression without the $ prefix.)
    */
  var responseParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * [Required] The method response's status code.
    */
  var statusCode: StatusCode
}

object PutMethodResponseRequest {
  @scala.inline
  def apply(
    httpMethod: String,
    resourceId: String,
    restApiId: String,
    statusCode: StatusCode,
    responseModels: MapOfStringToString = null,
    responseParameters: MapOfStringToBoolean = null
  ): PutMethodResponseRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod, resourceId = resourceId, restApiId = restApiId, statusCode = statusCode)
    if (responseModels != null) __obj.updateDynamic("responseModels")(responseModels)
    if (responseParameters != null) __obj.updateDynamic("responseParameters")(responseParameters)
    __obj.asInstanceOf[PutMethodResponseRequest]
  }
}

