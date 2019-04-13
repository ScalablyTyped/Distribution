package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartMatchBackfillOutput extends js.Object {
  /**
    * Ticket representing the backfill matchmaking request. This object includes the information in the request, ticket status, and match results as generated during the matchmaking process.
    */
  var MatchmakingTicket: js.UndefOr[MatchmakingTicket] = js.undefined
}

object StartMatchBackfillOutput {
  @scala.inline
  def apply(MatchmakingTicket: MatchmakingTicket = null): StartMatchBackfillOutput = {
    val __obj = js.Dynamic.literal()
    if (MatchmakingTicket != null) __obj.updateDynamic("MatchmakingTicket")(MatchmakingTicket)
    __obj.asInstanceOf[StartMatchBackfillOutput]
  }
}

