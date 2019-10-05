package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TelemetryRecord extends js.Object {
  /**
    * 
    */
  var BackendConnectionErrors: js.UndefOr[typings.awsDashSdk.clientsXrayMod.BackendConnectionErrors] = js.undefined
  /**
    * 
    */
  var SegmentsReceivedCount: js.UndefOr[NullableInteger] = js.undefined
  /**
    * 
    */
  var SegmentsRejectedCount: js.UndefOr[NullableInteger] = js.undefined
  /**
    * 
    */
  var SegmentsSentCount: js.UndefOr[NullableInteger] = js.undefined
  /**
    * 
    */
  var SegmentsSpilloverCount: js.UndefOr[NullableInteger] = js.undefined
  /**
    * 
    */
  var Timestamp: typings.awsDashSdk.clientsXrayMod.Timestamp
}

object TelemetryRecord {
  @scala.inline
  def apply(
    Timestamp: Timestamp,
    BackendConnectionErrors: BackendConnectionErrors = null,
    SegmentsReceivedCount: Int | scala.Double = null,
    SegmentsRejectedCount: Int | scala.Double = null,
    SegmentsSentCount: Int | scala.Double = null,
    SegmentsSpilloverCount: Int | scala.Double = null
  ): TelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp)
    if (BackendConnectionErrors != null) __obj.updateDynamic("BackendConnectionErrors")(BackendConnectionErrors)
    if (SegmentsReceivedCount != null) __obj.updateDynamic("SegmentsReceivedCount")(SegmentsReceivedCount.asInstanceOf[js.Any])
    if (SegmentsRejectedCount != null) __obj.updateDynamic("SegmentsRejectedCount")(SegmentsRejectedCount.asInstanceOf[js.Any])
    if (SegmentsSentCount != null) __obj.updateDynamic("SegmentsSentCount")(SegmentsSentCount.asInstanceOf[js.Any])
    if (SegmentsSpilloverCount != null) __obj.updateDynamic("SegmentsSpilloverCount")(SegmentsSpilloverCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryRecord]
  }
}

