package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApiKeyRequest extends js.Object {
  /**
    * [Required] The identifier of the ApiKey resource to be deleted.
    */
  var apiKey: String
}

object DeleteApiKeyRequest {
  @scala.inline
  def apply(apiKey: String): DeleteApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiKey = apiKey)
  
    __obj.asInstanceOf[DeleteApiKeyRequest]
  }
}

