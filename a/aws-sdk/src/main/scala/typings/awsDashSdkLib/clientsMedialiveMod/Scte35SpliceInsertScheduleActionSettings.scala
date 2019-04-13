package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scte35SpliceInsertScheduleActionSettings extends js.Object {
  /**
    * Optional, the duration for the splice_insert, in 90 KHz ticks. To convert seconds to ticks, multiple the seconds by 90,000. If you enter a duration, there is an expectation that the downstream system can read the duration and cue in at that time. If you do not enter a duration, the splice_insert will continue indefinitely and there is an expectation that you will enter a return_to_network to end the splice_insert at the appropriate time.
    */
  var Duration: js.UndefOr[__integerMin0Max8589934591] = js.undefined
  /**
    * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
    */
  var SpliceEventId: __integerMin0Max4294967295
}

object Scte35SpliceInsertScheduleActionSettings {
  @scala.inline
  def apply(
    SpliceEventId: __integerMin0Max4294967295,
    Duration: js.UndefOr[__integerMin0Max8589934591] = js.undefined
  ): Scte35SpliceInsertScheduleActionSettings = {
    val __obj = js.Dynamic.literal(SpliceEventId = SpliceEventId)
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    __obj.asInstanceOf[Scte35SpliceInsertScheduleActionSettings]
  }
}

