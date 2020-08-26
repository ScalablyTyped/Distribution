package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChannelsResult extends js.Object {
  var channels: js.Array[Channel] = js.native
  var isTruncated: Boolean = js.native
  var nextMarker: String | Null = js.native
  var res: NormalSuccessResponse = js.native
}

object ListChannelsResult {
  @scala.inline
  def apply(channels: js.Array[Channel], isTruncated: Boolean, res: NormalSuccessResponse): ListChannelsResult = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], isTruncated = isTruncated.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsResult]
  }
  @scala.inline
  implicit class ListChannelsResultOps[Self <: ListChannelsResult] (val x: Self) extends AnyVal {
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
    def setChannelsVarargs(value: Channel*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: js.Array[Channel]): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTruncated(value: Boolean): Self = this.set("isTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = this.set("res", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextMarker(value: String): Self = this.set("nextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextMarkerNull: Self = this.set("nextMarker", null)
  }
  
}

