package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Max extends js.Object {
  /** The maximum bitrate. */
  var max: Double
  /** The minimum bitrate. */
  var min: Double
}

object Max {
  @scala.inline
  def apply(max: Double, min: Double): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
}

