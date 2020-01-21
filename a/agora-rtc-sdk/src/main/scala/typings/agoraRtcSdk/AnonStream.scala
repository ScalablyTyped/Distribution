package typings.agoraRtcSdk

import typings.agoraRtcSdk.mod.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStream extends js.Object {
  /**
    * (Optional) Specifies a [[MediaStream]] object.
    *
    * If this parameter is empty, this method gets the supported decoding formats of the web browser as the receiver.
    * Otherwise the method gets the supported encoding formats as the sender. In most cases, the supported decoding and encoding formats are the same.
    */
  var stream: MediaStream
}

object AnonStream {
  @scala.inline
  def apply(stream: MediaStream): AnonStream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStream]
  }
}

