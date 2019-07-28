package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandshakeParty extends js.Object {
  /**
    * The unique identifier (ID) for the party. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lower-case letters or digits.
    */
  var Id: HandshakePartyId
  /**
    * The type of party.
    */
  var Type: HandshakePartyType
}

object HandshakeParty {
  @scala.inline
  def apply(Id: HandshakePartyId, Type: HandshakePartyType): HandshakeParty = {
    val __obj = js.Dynamic.literal(Id = Id, Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HandshakeParty]
  }
}

