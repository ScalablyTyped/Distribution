package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMatchBackfillOutput extends StObject {
  
  /**
    * Ticket representing the backfill matchmaking request. This object includes the information in the request, ticket status, and match results as generated during the matchmaking process.
    */
  var MatchmakingTicket: js.UndefOr[typings.awsSdk.clientsGameliftMod.MatchmakingTicket] = js.undefined
}
object StartMatchBackfillOutput {
  
  inline def apply(): StartMatchBackfillOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMatchBackfillOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartMatchBackfillOutput] (val x: Self) extends AnyVal {
    
    inline def setMatchmakingTicket(value: MatchmakingTicket): Self = StObject.set(x, "MatchmakingTicket", value.asInstanceOf[js.Any])
    
    inline def setMatchmakingTicketUndefined: Self = StObject.set(x, "MatchmakingTicket", js.undefined)
  }
}
