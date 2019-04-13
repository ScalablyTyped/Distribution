package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodResponse extends js.Object {
  /**
    * Specifies the Model resources used for the response's content-type. Response models are represented as a key/value map, with a content-type as the key and a Model name as the value.
    */
  var responseModels: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * A key-value map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header and the value specifies whether the associated method response header is required or not. The expression of the key must match the pattern method.response.header.{name}, where name is a valid and unique header name. API Gateway passes certain integration response data to the method response headers specified here according to the mapping you prescribe in the API's IntegrationResponse. The integration response data that can be mapped include an integration response header expressed in integration.response.header.{name}, a static value enclosed within a pair of single quotes (e.g., 'application/json'), or a JSON expression from the back-end response payload in the form of integration.response.body.{JSON-expression}, where JSON-expression is a valid JSON expression without the $ prefix.)
    */
  var responseParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined
  /**
    * The method response's status code.
    */
  var statusCode: js.UndefOr[StatusCode] = js.undefined
}

object MethodResponse {
  @scala.inline
  def apply(
    responseModels: MapOfStringToString = null,
    responseParameters: MapOfStringToBoolean = null,
    statusCode: StatusCode = null
  ): MethodResponse = {
    val __obj = js.Dynamic.literal()
    if (responseModels != null) __obj.updateDynamic("responseModels")(responseModels)
    if (responseParameters != null) __obj.updateDynamic("responseParameters")(responseParameters)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[MethodResponse]
  }
}

