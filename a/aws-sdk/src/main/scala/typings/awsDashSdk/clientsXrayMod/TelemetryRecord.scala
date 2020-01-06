package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TelemetryRecord extends js.Object {
  /**
    * 
    */
  var BackendConnectionErrors: js.UndefOr[typings.awsDashSdk.clientsXrayMod.BackendConnectionErrors] = js.native
  /**
    * 
    */
  var SegmentsReceivedCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var SegmentsRejectedCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var SegmentsSentCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var SegmentsSpilloverCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var Timestamp: typings.awsDashSdk.clientsXrayMod.Timestamp = js.native
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
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    if (BackendConnectionErrors != null) __obj.updateDynamic("BackendConnectionErrors")(BackendConnectionErrors.asInstanceOf[js.Any])
    if (SegmentsReceivedCount != null) __obj.updateDynamic("SegmentsReceivedCount")(SegmentsReceivedCount.asInstanceOf[js.Any])
    if (SegmentsRejectedCount != null) __obj.updateDynamic("SegmentsRejectedCount")(SegmentsRejectedCount.asInstanceOf[js.Any])
    if (SegmentsSentCount != null) __obj.updateDynamic("SegmentsSentCount")(SegmentsSentCount.asInstanceOf[js.Any])
    if (SegmentsSpilloverCount != null) __obj.updateDynamic("SegmentsSpilloverCount")(SegmentsSpilloverCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryRecord]
  }
}

