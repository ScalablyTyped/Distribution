package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSegmentVersionsResponse extends js.Object {
  var SegmentsResponse: typings.awsDashSdk.clientsPinpointMod.SegmentsResponse = js.native
}

object GetSegmentVersionsResponse {
  @scala.inline
  def apply(SegmentsResponse: SegmentsResponse): GetSegmentVersionsResponse = {
    val __obj = js.Dynamic.literal(SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSegmentVersionsResponse]
  }
}

