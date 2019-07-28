package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopMatchmakingInput extends js.Object {
  /**
    * Unique identifier for a matchmaking ticket.
    */
  var TicketId: MatchmakingIdStringModel
}

object StopMatchmakingInput {
  @scala.inline
  def apply(TicketId: MatchmakingIdStringModel): StopMatchmakingInput = {
    val __obj = js.Dynamic.literal(TicketId = TicketId)
  
    __obj.asInstanceOf[StopMatchmakingInput]
  }
}

