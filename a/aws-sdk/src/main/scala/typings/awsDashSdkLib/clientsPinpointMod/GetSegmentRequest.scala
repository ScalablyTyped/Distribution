package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSegmentRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    * The unique identifier for the segment.
    */
  var SegmentId: __string
}

object GetSegmentRequest {
  @scala.inline
  def apply(ApplicationId: __string, SegmentId: __string): GetSegmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, SegmentId = SegmentId)
  
    __obj.asInstanceOf[GetSegmentRequest]
  }
}

