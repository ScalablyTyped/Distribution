package typings.agoraDashRtcDashSdk

import typings.agoraDashRtcDashSdk.agoraDashRtcDashSdkMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stream_461528808 extends js.Object {
  /**
    * The stream that adds or removes a track:
    * - `video`: boolean, marks whether the stream contains a video track.
    * - `audio`: boolean, marks whether the stream contains an audio track.
    */
  var stream: Stream
}

object Anon_Stream_461528808 {
  @scala.inline
  def apply(stream: Stream): Anon_Stream_461528808 = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Stream_461528808]
  }
}

