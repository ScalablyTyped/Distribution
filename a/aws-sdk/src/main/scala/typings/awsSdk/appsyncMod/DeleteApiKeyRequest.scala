package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApiKeyRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The ID for the API key.
    */
  var id: String = js.native
}

object DeleteApiKeyRequest {
  @scala.inline
  def apply(apiId: String, id: String): DeleteApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteApiKeyRequest]
  }
}

