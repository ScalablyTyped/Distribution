package typings.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMax extends js.Object {
  /** The maximum bitrate. */
  var max: Double
  /** The minimum bitrate. */
  var min: Double
}

object AnonMax {
  @scala.inline
  def apply(max: Double, min: Double): AnonMax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMax]
  }
}

