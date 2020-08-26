package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodResponse extends js.Object {
  /**
    * Specifies the Model resources used for the response's content-type. Response models are represented as a key/value map, with a content-type as the key and a Model name as the value.
    */
  var responseModels: js.UndefOr[MapOfStringToString] = js.native
  /**
    * A key-value map specifying required or optional response parameters that API Gateway can send back to the caller. A key defines a method response header and the value specifies whether the associated method response header is required or not. The expression of the key must match the pattern method.response.header.{name}, where name is a valid and unique header name. API Gateway passes certain integration response data to the method response headers specified here according to the mapping you prescribe in the API's IntegrationResponse. The integration response data that can be mapped include an integration response header expressed in integration.response.header.{name}, a static value enclosed within a pair of single quotes (e.g., 'application/json'), or a JSON expression from the back-end response payload in the form of integration.response.body.{JSON-expression}, where JSON-expression is a valid JSON expression without the $ prefix.)
    */
  var responseParameters: js.UndefOr[MapOfStringToBoolean] = js.native
  /**
    * The method response's status code.
    */
  var statusCode: js.UndefOr[StatusCode] = js.native
}

object MethodResponse {
  @scala.inline
  def apply(): MethodResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodResponse]
  }
  @scala.inline
  implicit class MethodResponseOps[Self <: MethodResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResponseModels(value: MapOfStringToString): Self = this.set("responseModels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseModels: Self = this.set("responseModels", js.undefined)
    @scala.inline
    def setResponseParameters(value: MapOfStringToBoolean): Self = this.set("responseParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseParameters: Self = this.set("responseParameters", js.undefined)
    @scala.inline
    def setStatusCode(value: StatusCode): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
  
}

