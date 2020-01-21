package typings.agoraRtcSdk

import typings.agoraRtcSdk.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStream1130974660 extends js.Object {
  /**
    * The stream that adds or removes a track:
    * - `video`: boolean, marks whether the stream contains a video track.
    * - `audio`: boolean, marks whether the stream contains an audio track.
    */
  var stream: Stream
}

object AnonStream1130974660 {
  @scala.inline
  def apply(stream: Stream): AnonStream1130974660 = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStream1130974660]
  }
}

