package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameCaptureSettings extends js.Object {
  /**
    * The frequency, in seconds, for capturing frames for inclusion in the output.  For example, "10" means capture a frame every 10 seconds.
    */
  var CaptureInterval: __integerMin1Max3600
}

object FrameCaptureSettings {
  @scala.inline
  def apply(CaptureInterval: __integerMin1Max3600): FrameCaptureSettings = {
    val __obj = js.Dynamic.literal(CaptureInterval = CaptureInterval)
  
    __obj.asInstanceOf[FrameCaptureSettings]
  }
}

