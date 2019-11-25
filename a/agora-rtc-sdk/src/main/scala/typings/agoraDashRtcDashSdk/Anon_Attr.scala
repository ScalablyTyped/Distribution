package typings.agoraDashRtcDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attr extends js.Object {
  /**
    * Whether the remote media stream falls back to audio-only or switches back to the video:
    * - 1: the remote media stream falls back to audio-only due to unreliable network conditions.
    * - 0: the remote media stream switches back to the video stream after the network conditions improve.
    */
  var attr: Double
  /** ID of the remote user sending the stream. */
  var uid: String | Double
}

object Anon_Attr {
  @scala.inline
  def apply(attr: Double, uid: String | Double): Anon_Attr = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Attr]
  }
}

