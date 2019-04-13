package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptHandshakeRequest extends js.Object {
  /**
    * The unique identifier (ID) of the handshake that you want to accept. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lower-case letters or digits.
    */
  var HandshakeId: awsDashSdkLib.clientsOrganizationsMod.HandshakeId
}

object AcceptHandshakeRequest {
  @scala.inline
  def apply(HandshakeId: HandshakeId): AcceptHandshakeRequest = {
    val __obj = js.Dynamic.literal(HandshakeId = HandshakeId)
  
    __obj.asInstanceOf[AcceptHandshakeRequest]
  }
}

