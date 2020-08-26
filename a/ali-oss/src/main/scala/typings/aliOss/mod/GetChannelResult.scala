package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetChannelResult extends js.Object {
  var Audio: js.UndefOr[js.Object] = js.native
  var ConnectedTime: js.UndefOr[String] = js.native
  var RemoteAddr: js.UndefOr[String] = js.native
  var Status: String = js.native
  var Video: js.UndefOr[js.Object] = js.native
  var res: NormalSuccessResponse = js.native
}

object GetChannelResult {
  @scala.inline
  def apply(Status: String, res: NormalSuccessResponse): GetChannelResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelResult]
  }
  @scala.inline
  implicit class GetChannelResultOps[Self <: GetChannelResult] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = this.set("res", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudio(value: js.Object): Self = this.set("Audio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudio: Self = this.set("Audio", js.undefined)
    @scala.inline
    def setConnectedTime(value: String): Self = this.set("ConnectedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectedTime: Self = this.set("ConnectedTime", js.undefined)
    @scala.inline
    def setRemoteAddr(value: String): Self = this.set("RemoteAddr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAddr: Self = this.set("RemoteAddr", js.undefined)
    @scala.inline
    def setVideo(value: js.Object): Self = this.set("Video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("Video", js.undefined)
  }
  
}

