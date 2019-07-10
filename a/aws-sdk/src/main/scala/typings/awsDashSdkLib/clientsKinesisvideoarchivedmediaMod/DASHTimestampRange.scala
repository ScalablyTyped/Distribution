package typings
package awsDashSdkLib.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DASHTimestampRange extends js.Object {
  /**
    * The end of the timestamp range for the requested media. This value must be within 3 hours of the specified StartTimestamp, and it must be later than the StartTimestamp value. If FragmentSelectorType for the request is SERVER_TIMESTAMP, this value must be in the past. The EndTimestamp value is required for ON_DEMAND mode, but optional for LIVE_REPLAY mode. If the EndTimestamp is not set for LIVE_REPLAY mode then the session will continue to include newly ingested fragments until the session expires.  This value is inclusive. The EndTimestamp is compared to the (starting) timestamp of the fragment. Fragments that start before the EndTimestamp value and continue past it are included in the session. 
    */
  var EndTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The start of the timestamp range for the requested media. If the DASHTimestampRange value is specified, the StartTimestamp value is required.  This value is inclusive. Fragments that start before the StartTimestamp and continue past it are included in the session. If FragmentSelectorType is SERVER_TIMESTAMP, the StartTimestamp must be later than the stream head. 
    */
  var StartTimestamp: js.UndefOr[Timestamp] = js.undefined
}

object DASHTimestampRange {
  @scala.inline
  def apply(EndTimestamp: Timestamp = null, StartTimestamp: Timestamp = null): DASHTimestampRange = {
    val __obj = js.Dynamic.literal()
    if (EndTimestamp != null) __obj.updateDynamic("EndTimestamp")(EndTimestamp)
    if (StartTimestamp != null) __obj.updateDynamic("StartTimestamp")(StartTimestamp)
    __obj.asInstanceOf[DASHTimestampRange]
  }
}

