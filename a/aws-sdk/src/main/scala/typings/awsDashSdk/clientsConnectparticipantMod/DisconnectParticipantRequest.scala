package typings.awsDashSdk.clientsConnectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisconnectParticipantRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typings.awsDashSdk.clientsConnectparticipantMod.ClientToken] = js.native
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken = js.native
}

object DisconnectParticipantRequest {
  @scala.inline
  def apply(ConnectionToken: ParticipantToken, ClientToken: ClientToken = null): DisconnectParticipantRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectParticipantRequest]
  }
}

