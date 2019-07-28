package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMatchmakingOutput extends js.Object {
  /**
    * Collection of existing matchmaking ticket objects matching the request.
    */
  var TicketList: js.UndefOr[MatchmakingTicketList] = js.undefined
}

object DescribeMatchmakingOutput {
  @scala.inline
  def apply(TicketList: MatchmakingTicketList = null): DescribeMatchmakingOutput = {
    val __obj = js.Dynamic.literal()
    if (TicketList != null) __obj.updateDynamic("TicketList")(TicketList)
    __obj.asInstanceOf[DescribeMatchmakingOutput]
  }
}

