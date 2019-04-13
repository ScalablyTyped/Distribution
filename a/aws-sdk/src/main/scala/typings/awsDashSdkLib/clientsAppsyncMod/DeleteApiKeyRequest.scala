package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApiKeyRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The ID for the API key.
    */
  var id: String
}

object DeleteApiKeyRequest {
  @scala.inline
  def apply(apiId: String, id: String): DeleteApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, id = id)
  
    __obj.asInstanceOf[DeleteApiKeyRequest]
  }
}

