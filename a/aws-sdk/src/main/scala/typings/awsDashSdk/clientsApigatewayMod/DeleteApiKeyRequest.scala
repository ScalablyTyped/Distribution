package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApiKeyRequest extends js.Object {
  /**
    * [Required] The identifier of the ApiKey resource to be deleted.
    */
  var apiKey: String = js.native
}

object DeleteApiKeyRequest {
  @scala.inline
  def apply(apiKey: String): DeleteApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteApiKeyRequest]
  }
}

