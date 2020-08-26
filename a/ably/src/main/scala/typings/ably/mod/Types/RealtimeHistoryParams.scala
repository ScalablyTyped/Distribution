package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeHistoryParams extends js.Object {
  var direction: js.UndefOr[String] = js.native
  var end: js.UndefOr[Double] = js.native
  var limit: js.UndefOr[Double] = js.native
  var start: js.UndefOr[Double] = js.native
  var untilAttach: js.UndefOr[Boolean] = js.native
}

object RealtimeHistoryParams {
  @scala.inline
  def apply(): RealtimeHistoryParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealtimeHistoryParams]
  }
  @scala.inline
  implicit class RealtimeHistoryParamsOps[Self <: RealtimeHistoryParams] (val x: Self) extends AnyVal {
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setUntilAttach(value: Boolean): Self = this.set("untilAttach", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUntilAttach: Self = this.set("untilAttach", js.undefined)
  }
  
}

