package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelHistoryResult extends js.Object {
  var records: ChannelHistory
  var res: NormalSuccessResponse
}

object ChannelHistoryResult {
  @scala.inline
  def apply(records: ChannelHistory, res: NormalSuccessResponse): ChannelHistoryResult = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelHistoryResult]
  }
}

