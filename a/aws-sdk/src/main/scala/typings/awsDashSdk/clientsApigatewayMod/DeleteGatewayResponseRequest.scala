package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGatewayResponseRequest extends js.Object {
  /**
    * [Required] The response type of the associated GatewayResponse. Valid values are ACCESS_DENIEDAPI_CONFIGURATION_ERRORAUTHORIZER_FAILURE AUTHORIZER_CONFIGURATION_ERRORBAD_REQUEST_PARAMETERSBAD_REQUEST_BODYDEFAULT_4XXDEFAULT_5XXEXPIRED_TOKENINVALID_SIGNATUREINTEGRATION_FAILUREINTEGRATION_TIMEOUTINVALID_API_KEYMISSING_AUTHENTICATION_TOKEN QUOTA_EXCEEDEDREQUEST_TOO_LARGERESOURCE_NOT_FOUNDTHROTTLEDUNAUTHORIZEDUNSUPPORTED_MEDIA_TYPE 
    */
  var responseType: GatewayResponseType
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object DeleteGatewayResponseRequest {
  @scala.inline
  def apply(responseType: GatewayResponseType, restApiId: String): DeleteGatewayResponseRequest = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any], restApiId = restApiId)
  
    __obj.asInstanceOf[DeleteGatewayResponseRequest]
  }
}

