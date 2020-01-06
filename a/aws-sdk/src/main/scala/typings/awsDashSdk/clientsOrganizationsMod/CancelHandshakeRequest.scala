package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelHandshakeRequest extends js.Object {
  /**
    * The unique identifier (ID) of the handshake that you want to cancel. You can get the ID from the ListHandshakesForOrganization operation. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lowercase letters or digits.
    */
  var HandshakeId: typings.awsDashSdk.clientsOrganizationsMod.HandshakeId = js.native
}

object CancelHandshakeRequest {
  @scala.inline
  def apply(HandshakeId: HandshakeId): CancelHandshakeRequest = {
    val __obj = js.Dynamic.literal(HandshakeId = HandshakeId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelHandshakeRequest]
  }
}

