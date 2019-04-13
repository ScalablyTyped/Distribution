package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApiKeyResponse extends js.Object {
  /**
    * The API key.
    */
  var apiKey: js.UndefOr[ApiKey] = js.undefined
}

object CreateApiKeyResponse {
  @scala.inline
  def apply(apiKey: ApiKey = null): CreateApiKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    __obj.asInstanceOf[CreateApiKeyResponse]
  }
}

