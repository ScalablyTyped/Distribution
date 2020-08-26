package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Caller extends js.Object {
  var caller: js.UndefOr[String] = js.native
  var channelId: String = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object Caller {
  @scala.inline
  def apply(channelId: String): Caller = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caller]
  }
  @scala.inline
  implicit class CallerOps[Self <: Caller] (val x: Self) extends AnyVal {
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
    def setCaller(value: String): Self = this.set("caller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaller: Self = this.set("caller", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

