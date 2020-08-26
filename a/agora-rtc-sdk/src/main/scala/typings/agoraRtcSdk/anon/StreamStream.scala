package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamStream extends js.Object {
  /**
    * The stream that adds or removes a track:
    * - `video`: boolean, marks whether the stream contains a video track.
    * - `audio`: boolean, marks whether the stream contains an audio track.
    */
  var stream: typings.agoraRtcSdk.mod.Stream = js.native
}

object StreamStream {
  @scala.inline
  def apply(stream: typings.agoraRtcSdk.mod.Stream): StreamStream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamStream]
  }
  @scala.inline
  implicit class StreamStreamOps[Self <: StreamStream] (val x: Self) extends AnyVal {
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
    def setStream(value: typings.agoraRtcSdk.mod.Stream): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
  
}

