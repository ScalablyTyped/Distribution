package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuietTime extends js.Object {
  /**
    * The specific time when quiet time ends. This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
    */
  var End: js.UndefOr[__string] = js.undefined
  /**
    * The specific time when quiet time begins. This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
    */
  var Start: js.UndefOr[__string] = js.undefined
}

object QuietTime {
  @scala.inline
  def apply(End: __string = null, Start: __string = null): QuietTime = {
    val __obj = js.Dynamic.literal()
    if (End != null) __obj.updateDynamic("End")(End)
    if (Start != null) __obj.updateDynamic("Start")(Start)
    __obj.asInstanceOf[QuietTime]
  }
}

