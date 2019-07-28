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
    SegmentsReceivedCount: js.UndefOr[NullableInteger] = js.undefined,
    SegmentsRejectedCount: js.UndefOr[NullableInteger] = js.undefined,
    SegmentsSentCount: js.UndefOr[NullableInteger] = js.undefined,
    SegmentsSpilloverCount: js.UndefOr[NullableInteger] = js.undefined
  ): TelemetryRecord = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp)
    if (BackendConnectionErrors != null) __obj.updateDynamic("BackendConnectionErrors")(BackendConnectionErrors)
    if (!js.isUndefined(SegmentsReceivedCount)) __obj.updateDynamic("SegmentsReceivedCount")(SegmentsReceivedCount)
    if (!js.isUndefined(SegmentsRejectedCount)) __obj.updateDynamic("SegmentsRejectedCount")(SegmentsRejectedCount)
    if (!js.isUndefined(SegmentsSentCount)) __obj.updateDynamic("SegmentsSentCount")(SegmentsSentCount)
    if (!js.isUndefined(SegmentsSpilloverCount)) __obj.updateDynamic("SegmentsSpilloverCount")(SegmentsSpilloverCount)
    __obj.asInstanceOf[TelemetryRecord]
  }
}

