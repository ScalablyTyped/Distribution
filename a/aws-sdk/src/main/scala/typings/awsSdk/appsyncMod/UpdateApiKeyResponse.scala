package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApiKeyResponse extends js.Object {
  /**
    * The API key.
    */
  var apiKey: js.UndefOr[ApiKey] = js.native
}

object UpdateApiKeyResponse {
  @scala.inline
  def apply(apiKey: ApiKey = null): UpdateApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApiKeyResponse]
  }
}

