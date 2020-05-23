package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamStream extends js.Object {
  /**
    * The stream that adds or removes a track:
    * - `video`: boolean, marks whether the stream contains a video track.
    * - `audio`: boolean, marks whether the stream contains an audio track.
    */
  var stream: typings.agoraRtcSdk.mod.Stream
}

object StreamStream {
  @scala.inline
  def apply(stream: typings.agoraRtcSdk.mod.Stream): StreamStream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamStream]
  }
}

