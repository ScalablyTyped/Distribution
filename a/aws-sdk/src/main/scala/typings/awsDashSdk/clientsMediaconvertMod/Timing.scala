package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timing extends js.Object {
  /**
    * The time, in Unix epoch format, that the transcoding job finished
    */
  var FinishTime: js.UndefOr[__timestampUnix] = js.undefined
  /**
    * The time, in Unix epoch format, that transcoding for the job began.
    */
  var StartTime: js.UndefOr[__timestampUnix] = js.undefined
  /**
    * The time, in Unix epoch format, that you submitted the job.
    */
  var SubmitTime: js.UndefOr[__timestampUnix] = js.undefined
}

object Timing {
  @scala.inline
  def apply(
    FinishTime: __timestampUnix = null,
    StartTime: __timestampUnix = null,
    SubmitTime: __timestampUnix = null
  ): Timing = {
    val __obj = js.Dynamic.literal()
    if (FinishTime != null) __obj.updateDynamic("FinishTime")(FinishTime)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (SubmitTime != null) __obj.updateDynamic("SubmitTime")(SubmitTime)
    __obj.asInstanceOf[Timing]
  }
}

