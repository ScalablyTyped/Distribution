package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApiKeyRequest extends js.Object {
  /**
    * The ID for your GraphQL API.
    */
  var apiId: String
  /**
    * A description of the purpose of the API key.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The time from creation time after which the API key expires. The date is represented as seconds since the epoch, rounded down to the nearest hour. The default value for this parameter is 7 days from creation time. For more information, see .
    */
  var expires: js.UndefOr[Long] = js.undefined
}

object CreateApiKeyRequest {
  @scala.inline
  def apply(apiId: String, description: String = null, expires: Int | Double = null): CreateApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiKeyRequest]
  }
}

