package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentsResponse extends js.Object {
  /**
    * An array of responses, one for each segment that's associated with the application (Segments resource) or each version of a segment that's associated with the application (Segment Versions resource).
    */
  var Item: ListOfSegmentResponse
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object SegmentsResponse {
  @scala.inline
  def apply(Item: ListOfSegmentResponse, NextToken: __string = null): SegmentsResponse = {
    val __obj = js.Dynamic.literal(Item = Item)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[SegmentsResponse]
  }
}

