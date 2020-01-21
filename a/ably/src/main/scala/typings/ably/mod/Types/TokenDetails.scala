package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenDetails extends js.Object {
  var capability: String
  var clientId: js.UndefOr[String] = js.undefined
  var expires: Double
  var issued: Double
  var token: String
}

object TokenDetails {
  @scala.inline
  def apply(capability: String, expires: Double, issued: Double, token: String, clientId: String = null): TokenDetails = {
    val __obj = js.Dynamic.literal(capability = capability.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], issued = issued.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenDetails]
  }
}

