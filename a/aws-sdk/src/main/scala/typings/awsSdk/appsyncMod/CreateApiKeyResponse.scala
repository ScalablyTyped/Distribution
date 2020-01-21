package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApiKeyResponse extends js.Object {
  /**
    * The API key.
    */
  var apiKey: js.UndefOr[ApiKey] = js.native
}

object CreateApiKeyResponse {
  @scala.inline
  def apply(apiKey: ApiKey = null): CreateApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiKeyResponse]
  }
}

