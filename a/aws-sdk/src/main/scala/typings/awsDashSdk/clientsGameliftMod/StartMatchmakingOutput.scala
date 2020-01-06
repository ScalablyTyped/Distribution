package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMatchmakingOutput extends js.Object {
  /**
    * Ticket representing the matchmaking request. This object include the information included in the request, ticket status, and match results as generated during the matchmaking process.
    */
  var MatchmakingTicket: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.MatchmakingTicket] = js.native
}

object StartMatchmakingOutput {
  @scala.inline
  def apply(MatchmakingTicket: MatchmakingTicket = null): StartMatchmakingOutput = {
    val __obj = js.Dynamic.literal()
    if (MatchmakingTicket != null) __obj.updateDynamic("MatchmakingTicket")(MatchmakingTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMatchmakingOutput]
  }
}

