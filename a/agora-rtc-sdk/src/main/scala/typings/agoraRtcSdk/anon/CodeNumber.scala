package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeNumber extends js.Object {
  /** The event code for media stream relay.
    *
    * - 0: The user disconnects from the server due to a poor network connection.
    * - 1: The user is connected to the server.
    * - 2: The user joins the source channel.
    * - 3: The user joins the destination channel.
    * - 4: The SDK starts relaying the media stream to the destination channel.
    * - 5: The server receives the video stream from the source channel.
    * - 6: The server receives the audio stream from the source channel.
    * - 7: The destination channel is updated.
    */
  var code: Double
}

object CodeNumber {
  @scala.inline
  def apply(code: Double): CodeNumber = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeNumber]
  }
}

