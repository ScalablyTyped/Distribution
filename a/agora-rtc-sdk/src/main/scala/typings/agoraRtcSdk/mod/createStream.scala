package typings.agoraRtcSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agora-rtc-sdk", "createStream")
@js.native
object createStream extends js.Object {
  /**
    * Creates a Stream Object
    *
    * This method creates and returns a stream object.
    * @example `AgoraRTC.createStream(spec)`
    * @param spec Defines the properties of the stream, see {@link StreamSpec} for details.
    */
  def apply(spec: StreamSpec): Stream = js.native
}

