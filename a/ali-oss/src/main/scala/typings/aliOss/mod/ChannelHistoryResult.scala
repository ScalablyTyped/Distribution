package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelHistoryResult extends js.Object {
  var records: ChannelHistory = js.native
  var res: NormalSuccessResponse = js.native
}

object ChannelHistoryResult {
  @scala.inline
  def apply(records: ChannelHistory, res: NormalSuccessResponse): ChannelHistoryResult = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHistoryResult]
  }
  @scala.inline
  implicit class ChannelHistoryResultOps[Self <: ChannelHistoryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRecords(value: ChannelHistory): Self = this.set("records", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = this.set("res", value.asInstanceOf[js.Any])
  }
  
}

