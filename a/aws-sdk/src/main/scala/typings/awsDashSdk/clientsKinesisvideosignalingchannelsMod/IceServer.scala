package typings.awsDashSdk.clientsKinesisvideosignalingchannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IceServer extends js.Object {
  /**
    * A password to login to the ICE server.
    */
  var Password: js.UndefOr[typings.awsDashSdk.clientsKinesisvideosignalingchannelsMod.Password] = js.native
  /**
    * The period of time, in seconds, during which the username and password are valid.
    */
  var Ttl: js.UndefOr[typings.awsDashSdk.clientsKinesisvideosignalingchannelsMod.Ttl] = js.native
  /**
    * An array of URIs, in the form specified in the I-D.petithuguenin-behave-turn-uris spec. These URIs provide the different addresses and/or protocols that can be used to reach the TURN server.
    */
  var Uris: js.UndefOr[typings.awsDashSdk.clientsKinesisvideosignalingchannelsMod.Uris] = js.native
  /**
    * A username to login to the ICE server.
    */
  var Username: js.UndefOr[typings.awsDashSdk.clientsKinesisvideosignalingchannelsMod.Username] = js.native
}

object IceServer {
  @scala.inline
  def apply(Password: Password = null, Ttl: Int | Double = null, Uris: Uris = null, Username: Username = null): IceServer = {
    val __obj = js.Dynamic.literal()
    if (Password != null) __obj.updateDynamic("Password")(Password.asInstanceOf[js.Any])
    if (Ttl != null) __obj.updateDynamic("Ttl")(Ttl.asInstanceOf[js.Any])
    if (Uris != null) __obj.updateDynamic("Uris")(Uris.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IceServer]
  }
}

