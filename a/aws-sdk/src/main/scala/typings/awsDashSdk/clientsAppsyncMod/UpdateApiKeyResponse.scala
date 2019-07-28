package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApiKeyResponse extends js.Object {
  /**
    * The API key.
    */
  var apiKey: js.UndefOr[ApiKey] = js.undefined
}

object UpdateApiKeyResponse {
  @scala.inline
  def apply(apiKey: ApiKey = null): UpdateApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    __obj.asInstanceOf[UpdateApiKeyResponse]
  }
}

