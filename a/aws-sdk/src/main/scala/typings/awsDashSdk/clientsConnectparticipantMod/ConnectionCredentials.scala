package typings.awsDashSdk.clientsConnectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionCredentials extends js.Object {
  /**
    * The connection token.
    */
  var ConnectionToken: js.UndefOr[ParticipantToken] = js.native
  /**
    * The expiration of the token. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var Expiry: js.UndefOr[ISO8601Datetime] = js.native
}

object ConnectionCredentials {
  @scala.inline
  def apply(ConnectionToken: ParticipantToken = null, Expiry: ISO8601Datetime = null): ConnectionCredentials = {
    val __obj = js.Dynamic.literal()
    if (ConnectionToken != null) __obj.updateDynamic("ConnectionToken")(ConnectionToken.asInstanceOf[js.Any])
    if (Expiry != null) __obj.updateDynamic("Expiry")(Expiry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionCredentials]
  }
}

