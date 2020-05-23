package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  /** Height of the video. The value range is [1,10000]. */
  var height: Double
  /** Width of the video. The value range is [1,10000]. */
  var width: Double
}

object Height {
  @scala.inline
  def apply(height: Double, width: Double): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

