package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectedLogEventsInfo extends js.Object {
  /**
    * The expired log events.
    */
  var expiredLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined
  /**
    * The log events that are too new.
    */
  var tooNewLogEventStartIndex: js.UndefOr[LogEventIndex] = js.undefined
  /**
    * The log events that are too old.
    */
  var tooOldLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined
}

object RejectedLogEventsInfo {
  @scala.inline
  def apply(
    expiredLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined,
    tooNewLogEventStartIndex: js.UndefOr[LogEventIndex] = js.undefined,
    tooOldLogEventEndIndex: js.UndefOr[LogEventIndex] = js.undefined
  ): RejectedLogEventsInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expiredLogEventEndIndex)) __obj.updateDynamic("expiredLogEventEndIndex")(expiredLogEventEndIndex)
    if (!js.isUndefined(tooNewLogEventStartIndex)) __obj.updateDynamic("tooNewLogEventStartIndex")(tooNewLogEventStartIndex)
    if (!js.isUndefined(tooOldLogEventEndIndex)) __obj.updateDynamic("tooOldLogEventEndIndex")(tooOldLogEventEndIndex)
    __obj.asInstanceOf[RejectedLogEventsInfo]
  }
}

