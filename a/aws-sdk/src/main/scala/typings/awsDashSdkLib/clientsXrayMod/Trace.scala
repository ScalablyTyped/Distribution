package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trace extends js.Object {
  /**
    * The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.
    */
  var Duration: js.UndefOr[NullableDouble] = js.undefined
  /**
    * The unique identifier for the request that generated the trace's segments and subsegments.
    */
  var Id: js.UndefOr[TraceId] = js.undefined
  /**
    * Segment documents for the segments and subsegments that comprise the trace.
    */
  var Segments: js.UndefOr[SegmentList] = js.undefined
}

object Trace {
  @scala.inline
  def apply(
    Duration: js.UndefOr[NullableDouble] = js.undefined,
    Id: TraceId = null,
    Segments: SegmentList = null
  ): Trace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Segments != null) __obj.updateDynamic("Segments")(Segments)
    __obj.asInstanceOf[Trace]
  }
}

