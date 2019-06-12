package typings
package agoraDashRtcDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attr extends js.Object {
  /**
    * Whether the remote media stream falls back to audio-only or switches back to the video:
    * - 1: the remote media stream falls back to audio-only due to unreliable network conditions.
    * - 0: the remote media stream switches back to the video stream after the network conditions improve.
    */
  var attr: scala.Double
  /** ID of the remote user sending the stream. */
  var uid: java.lang.String | scala.Double
}

object Anon_Attr {
  @scala.inline
  def apply(attr: scala.Double, uid: java.lang.String | scala.Double): Anon_Attr = {
    val __obj = js.Dynamic.literal(attr = attr, uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Attr]
  }
}

