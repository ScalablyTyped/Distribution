package typings
package aliDashOssLib.aliDashOssMod.OSSNs

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
    val __obj = js.Dynamic.literal(records = records, res = res)
  
    __obj.asInstanceOf[ChannelHistoryResult]
  }
}

