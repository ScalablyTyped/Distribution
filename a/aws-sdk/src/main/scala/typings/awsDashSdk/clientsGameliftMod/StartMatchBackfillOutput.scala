package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMatchBackfillOutput extends js.Object {
  /**
    * Ticket representing the backfill matchmaking request. This object includes the information in the request, ticket status, and match results as generated during the matchmaking process.
    */
  var MatchmakingTicket: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.MatchmakingTicket] = js.native
}

object StartMatchBackfillOutput {
  @scala.inline
  def apply(MatchmakingTicket: MatchmakingTicket = null): StartMatchBackfillOutput = {
    val __obj = js.Dynamic.literal()
    if (MatchmakingTicket != null) __obj.updateDynamic("MatchmakingTicket")(MatchmakingTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMatchBackfillOutput]
  }
}

