package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputClippingSettings extends js.Object {
  /**
    * The source of the timecodes in the source being clipped.
    */
  var InputTimecodeSource: typings.awsDashSdk.clientsMedialiveMod.InputTimecodeSource
  /**
    * Settings to identify the start of the clip.
    */
  var StartTimecode: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.StartTimecode] = js.undefined
  /**
    * Settings to identify the end of the clip.
    */
  var StopTimecode: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.StopTimecode] = js.undefined
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

