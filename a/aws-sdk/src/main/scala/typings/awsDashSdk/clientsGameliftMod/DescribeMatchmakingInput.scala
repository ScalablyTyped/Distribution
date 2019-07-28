package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMatchmakingInput extends js.Object {
  /**
    * Unique identifier for a matchmaking ticket. You can include up to 10 ID values. 
    */
  var TicketIds: MatchmakingIdList
}

object DescribeMatchmakingInput {
  @scala.inline
  def apply(TicketIds: MatchmakingIdList): DescribeMatchmakingInput = {
    val __obj = js.Dynamic.literal(TicketIds = TicketIds)
  
    __obj.asInstanceOf[DescribeMatchmakingInput]
  }
}

