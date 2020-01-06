package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTimecode extends js.Object {
  /**
    * If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the clip to exclude (the default) or include the frame specified by the timecode.
    */
  var LastFrameClippingBehavior: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.LastFrameClippingBehavior] = js.native
  /**
    * The timecode for the frame where you want to stop the clip. Optional; if not specified, the clip continues to the end of the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
    */
  var Timecode: js.UndefOr[__string] = js.native
}

object StopTimecode {
  @scala.inline
  def apply(LastFrameClippingBehavior: LastFrameClippingBehavior = null, Timecode: __string = null): StopTimecode = {
    val __obj = js.Dynamic.literal()
    if (LastFrameClippingBehavior != null) __obj.updateDynamic("LastFrameClippingBehavior")(LastFrameClippingBehavior.asInstanceOf[js.Any])
    if (Timecode != null) __obj.updateDynamic("Timecode")(Timecode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTimecode]
  }
}

