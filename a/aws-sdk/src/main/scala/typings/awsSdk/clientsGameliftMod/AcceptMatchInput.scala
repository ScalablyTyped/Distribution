package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptMatchInput extends StObject {
  
  /**
    * Player response to the proposed match.
    */
  var AcceptanceType: typings.awsSdk.clientsGameliftMod.AcceptanceType
  
  /**
    * A unique identifier for a player delivering the response. This parameter can include one or multiple player IDs.
    */
  var PlayerIds: StringList
  
  /**
    * A unique identifier for a matchmaking ticket. The ticket must be in status REQUIRES_ACCEPTANCE; otherwise this request will fail.
    */
  var TicketId: MatchmakingIdStringModel
}
object AcceptMatchInput {
  
  inline def apply(AcceptanceType: AcceptanceType, PlayerIds: StringList, TicketId: MatchmakingIdStringModel): AcceptMatchInput = {
    val __obj = js.Dynamic.literal(AcceptanceType = AcceptanceType.asInstanceOf[js.Any], PlayerIds = PlayerIds.asInstanceOf[js.Any], TicketId = TicketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptMatchInput]
  }
  
  extension [Self <: AcceptMatchInput](x: Self) {
    
    inline def setAcceptanceType(value: AcceptanceType): Self = StObject.set(x, "AcceptanceType", value.asInstanceOf[js.Any])
    
    inline def setPlayerIds(value: StringList): Self = StObject.set(x, "PlayerIds", value.asInstanceOf[js.Any])
    
    inline def setPlayerIdsVarargs(value: NonZeroAndMaxString*): Self = StObject.set(x, "PlayerIds", js.Array(value*))
    
    inline def setTicketId(value: MatchmakingIdStringModel): Self = StObject.set(x, "TicketId", value.asInstanceOf[js.Any])
  }
}
