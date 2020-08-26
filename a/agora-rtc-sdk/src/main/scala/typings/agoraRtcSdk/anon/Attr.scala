package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attr extends js.Object {
  /**
    * Whether the remote media stream falls back to audio-only or switches back to the video:
    * - 1: the remote media stream falls back to audio-only due to unreliable network conditions.
    * - 0: the remote media stream switches back to the video stream after the network conditions improve.
    */
  var attr: Double = js.native
  /** ID of the remote user sending the stream. */
  var uid: String | Double = js.native
}

object Attr {
  @scala.inline
  def apply(attr: Double, uid: String | Double): Attr = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attr]
  }
  @scala.inline
  implicit class AttrOps[Self <: Attr] (val x: Self) extends AnyVal {
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
    def setAttr(value: Double): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: String | Double): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
  
}

