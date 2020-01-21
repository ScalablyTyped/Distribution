package typings.apolloServerTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiKeyHash extends js.Object {
  var apiKeyHash: js.UndefOr[String] = js.undefined
  var serviceID: js.UndefOr[String] = js.undefined
}

object AnonApiKeyHash {
  @scala.inline
  def apply(apiKeyHash: String = null, serviceID: String = null): AnonApiKeyHash = {
    val __obj = js.Dynamic.literal()
    if (apiKeyHash != null) __obj.updateDynamic("apiKeyHash")(apiKeyHash.asInstanceOf[js.Any])
    if (serviceID != null) __obj.updateDynamic("serviceID")(serviceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApiKeyHash]
  }
}

