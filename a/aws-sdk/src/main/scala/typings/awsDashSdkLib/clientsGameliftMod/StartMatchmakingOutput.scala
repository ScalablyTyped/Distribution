package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartMatchmakingOutput extends js.Object {
  /**
    * Ticket representing the matchmaking request. This object include the information included in the request, ticket status, and match results as generated during the matchmaking process.
    */
  var MatchmakingTicket: js.UndefOr[MatchmakingTicket] = js.undefined
}

object StartMatchmakingOutput {
  @scala.inline
  def apply(MatchmakingTicket: MatchmakingTicket = null): StartMatchmakingOutput = {
    val __obj = js.Dynamic.literal()
    if (MatchmakingTicket != null) __obj.updateDynamic("MatchmakingTicket")(MatchmakingTicket)
    __obj.asInstanceOf[StartMatchmakingOutput]
  }
}

