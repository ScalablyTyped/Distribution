package typings.awsDashSdk.clientsConnectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateParticipantConnectionRequest extends js.Object {
  /**
    * Participant Token as obtained from StartChatContact API response.
    */
  var ParticipantToken: typings.awsDashSdk.clientsConnectparticipantMod.ParticipantToken = js.native
  /**
    * Type of connection information required.
    */
  var Type: ConnectionTypeList = js.native
}

object CreateParticipantConnectionRequest {
  @scala.inline
  def apply(ParticipantToken: ParticipantToken, Type: ConnectionTypeList): CreateParticipantConnectionRequest = {
    val __obj = js.Dynamic.literal(ParticipantToken = ParticipantToken.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateParticipantConnectionRequest]
  }
}

