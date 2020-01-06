package typings.awsDashSdk.clientsConnectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateParticipantConnectionResponse extends js.Object {
  /**
    * Creates the participant's connection credentials. The authentication token associated with the participant's connection.
    */
  var ConnectionCredentials: js.UndefOr[typings.awsDashSdk.clientsConnectparticipantMod.ConnectionCredentials] = js.native
  /**
    * Creates the participant's websocket connection.
    */
  var Websocket: js.UndefOr[typings.awsDashSdk.clientsConnectparticipantMod.Websocket] = js.native
}

object CreateParticipantConnectionResponse {
  @scala.inline
  def apply(ConnectionCredentials: ConnectionCredentials = null, Websocket: Websocket = null): CreateParticipantConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (ConnectionCredentials != null) __obj.updateDynamic("ConnectionCredentials")(ConnectionCredentials.asInstanceOf[js.Any])
    if (Websocket != null) __obj.updateDynamic("Websocket")(Websocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParticipantConnectionResponse]
  }
}

