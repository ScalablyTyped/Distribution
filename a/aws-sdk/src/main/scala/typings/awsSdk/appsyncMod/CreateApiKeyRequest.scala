package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApiKeyRequest extends js.Object {
  /**
    * The ID for your GraphQL API.
    */
  var apiId: String = js.native
  /**
    * A description of the purpose of the API key.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The time from creation time after which the API key expires. The date is represented as seconds since the epoch, rounded down to the nearest hour. The default value for this parameter is 7 days from creation time. For more information, see .
    */
  var expires: js.UndefOr[Long] = js.native
}

object CreateApiKeyRequest {
  @scala.inline
  def apply(apiId: String, description: String = null, expires: js.UndefOr[Long] = js.undefined): CreateApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiKeyRequest]
  }
}

