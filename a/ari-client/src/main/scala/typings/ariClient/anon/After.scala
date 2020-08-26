package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait After extends js.Object {
  var after: js.UndefOr[Double] = js.native
  var before: js.UndefOr[Double] = js.native
  var between: js.UndefOr[Double] = js.native
  var channelId: String = js.native
  var dtmf: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
}

object After {
  @scala.inline
  def apply(channelId: String): After = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  @scala.inline
  implicit class AfterOps[Self <: After] (val x: Self) extends AnyVal {
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfter(value: Double): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setBefore(value: Double): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setBetween(value: Double): Self = this.set("between", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBetween: Self = this.set("between", js.undefined)
    @scala.inline
    def setDtmf(value: String): Self = this.set("dtmf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtmf: Self = this.set("dtmf", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
  
}

