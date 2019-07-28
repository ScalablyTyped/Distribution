package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptMatchInput extends js.Object {
  /**
    * Player response to the proposed match.
    */
  var AcceptanceType: typings.awsDashSdk.clientsGameliftMod.AcceptanceType
  /**
    * Unique identifier for a player delivering the response. This parameter can include one or multiple player IDs.
    */
  var PlayerIds: StringList
  /**
    * Unique identifier for a matchmaking ticket. The ticket must be in status REQUIRES_ACCEPTANCE; otherwise this request will fail.
    */
  var TicketId: MatchmakingIdStringModel
}

object AcceptMatchInput {
  @scala.inline
  def apply(AcceptanceType: AcceptanceType, PlayerIds: StringList, TicketId: MatchmakingIdStringModel): AcceptMatchInput = {
    val __obj = js.Dynamic.literal(AcceptanceType = AcceptanceType.asInstanceOf[js.Any], PlayerIds = PlayerIds, TicketId = TicketId)
  
    __obj.asInstanceOf[AcceptMatchInput]
  }
}

