package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputClipping extends js.Object {
  /**
    * Set End timecode (EndTimecode) to the end of the portion of the input you are clipping. The frame corresponding to the End timecode value is included in the clip. Start timecode or End timecode may be left blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When choosing this value, take into account your setting for timecode source under input settings (InputTimecodeSource). For example, if you have embedded timecodes that start at 01:00:00:00 and you want your clip to end six minutes into the video, use 01:06:00:00.
    */
  var EndTimecode: js.UndefOr[__stringPattern010920405090509092] = js.undefined
  /**
    * Set Start timecode (StartTimecode) to the beginning of the portion of the input you are clipping. The frame corresponding to the Start timecode value is included in the clip. Start timecode or End timecode may be left blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When choosing this value, take into account your setting for Input timecode source. For example, if you have embedded timecodes that start at 01:00:00:00 and you want your clip to begin five minutes into the video, use 01:05:00:00.
    */
  var StartTimecode: js.UndefOr[__stringPattern010920405090509092] = js.undefined
}

object InputClipping {
  @scala.inline
  def apply(
    EndTimecode: __stringPattern010920405090509092 = null,
    StartTimecode: __stringPattern010920405090509092 = null
  ): InputClipping = {
    val __obj = js.Dynamic.literal()
    if (EndTimecode != null) __obj.updateDynamic("EndTimecode")(EndTimecode)
    if (StartTimecode != null) __obj.updateDynamic("StartTimecode")(StartTimecode)
    __obj.asInstanceOf[InputClipping]
  }
}

