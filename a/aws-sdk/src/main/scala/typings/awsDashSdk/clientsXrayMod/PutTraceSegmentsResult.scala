package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutTraceSegmentsResult extends js.Object {
  /**
    * Segments that failed processing.
    */
  var UnprocessedTraceSegments: js.UndefOr[UnprocessedTraceSegmentList] = js.undefined
}

object PutTraceSegmentsResult {
  @scala.inline
  def apply(UnprocessedTraceSegments: UnprocessedTraceSegmentList = null): PutTraceSegmentsResult = {
    val __obj = js.Dynamic.literal()
    if (UnprocessedTraceSegments != null) __obj.updateDynamic("UnprocessedTraceSegments")(UnprocessedTraceSegments)
    __obj.asInstanceOf[PutTraceSegmentsResult]
  }
}

