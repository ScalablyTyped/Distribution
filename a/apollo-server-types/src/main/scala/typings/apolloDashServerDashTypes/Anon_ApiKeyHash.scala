package typings.apolloDashServerDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiKeyHash extends js.Object {
  var apiKeyHash: js.UndefOr[String] = js.undefined
  var serviceID: js.UndefOr[String] = js.undefined
}

object Anon_ApiKeyHash {
  @scala.inline
  def apply(apiKeyHash: String = null, serviceID: String = null): Anon_ApiKeyHash = {
    val __obj = js.Dynamic.literal()
    if (apiKeyHash != null) __obj.updateDynamic("apiKeyHash")(apiKeyHash.asInstanceOf[js.Any])
    if (serviceID != null) __obj.updateDynamic("serviceID")(serviceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ApiKeyHash]
  }
}

