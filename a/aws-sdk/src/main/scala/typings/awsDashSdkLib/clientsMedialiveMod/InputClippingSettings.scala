package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputClippingSettings extends js.Object {
  /**
    * The source of the timecodes in the source being clipped.
    */
  var InputTimecodeSource: awsDashSdkLib.clientsMedialiveMod.InputTimecodeSource
  /**
    * Settings to identify the start of the clip.
    */
  var StartTimecode: js.UndefOr[StartTimecode] = js.undefined
  /**
    * Settings to identify the end of the clip.
    */
  var StopTimecode: js.UndefOr[StopTimecode] = js.undefined
}

object InputClippingSettings {
  @scala.inline
  def apply(
    InputTimecodeSource: InputTimecodeSource,
    StartTimecode: StartTimecode = null,
    StopTimecode: StopTimecode = null
  ): InputClippingSettings = {
    val __obj = js.Dynamic.literal(InputTimecodeSource = InputTimecodeSource.asInstanceOf[js.Any])
    if (StartTimecode != null) __obj.updateDynamic("StartTimecode")(StartTimecode)
    if (StopTimecode != null) __obj.updateDynamic("StopTimecode")(StopTimecode)
    __obj.asInstanceOf[InputClippingSettings]
  }
}

