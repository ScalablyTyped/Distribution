package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApiKeyRequest extends js.Object {
  /**
    * The ID for the GraphQL API.
    */
  var apiId: String
  /**
    * A description of the purpose of the API key.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The time from update time after which the API key expires. The date is represented as seconds since the epoch. For more information, see .
    */
  var expires: js.UndefOr[Long] = js.undefined
  /**
    * The API key ID.
    */
  var id: String
}

object UpdateApiKeyRequest {
  @scala.inline
  def apply(apiId: String, id: String, description: String = null, expires: js.UndefOr[Long] = js.undefined): UpdateApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, id = id)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires)
    __obj.asInstanceOf[UpdateApiKeyRequest]
  }
}

