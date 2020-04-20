package typings.agoraRtcSdk

import typings.agoraRtcSdk.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStreamStream extends js.Object {
  /**
    * The stream that adds or removes a track:
    * - `video`: boolean, marks whether the stream contains a video track.
    * - `audio`: boolean, marks whether the stream contains an audio track.
    */
  var stream: Stream
}

object AnonStreamStream {
  @scala.inline
  def apply(stream: Stream): AnonStreamStream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStreamStream]
  }
}

