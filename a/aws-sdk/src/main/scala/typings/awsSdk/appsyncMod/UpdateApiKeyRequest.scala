package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApiKeyRequest extends js.Object {
  /**
    * The ID for the GraphQL API.
    */
  var apiId: String = js.native
  /**
    * A description of the purpose of the API key.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The time from update time after which the API key expires. The date is represented as seconds since the epoch. For more information, see .
    */
  var expires: js.UndefOr[Long] = js.native
  /**
    * The API key ID.
    */
  var id: String = js.native
}

object UpdateApiKeyRequest {
  @scala.inline
  def apply(apiId: String, id: String, description: String = null, expires: Int | Double = null): UpdateApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApiKeyRequest]
  }
}

