package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSegmentRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    * The unique identifier for the segment.
    */
  var SegmentId: __string
  var WriteSegmentRequest: awsDashSdkLib.clientsPinpointMod.WriteSegmentRequest
}

object UpdateSegmentRequest {
  @scala.inline
  def apply(ApplicationId: __string, SegmentId: __string, WriteSegmentRequest: WriteSegmentRequest): UpdateSegmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, SegmentId = SegmentId, WriteSegmentRequest = WriteSegmentRequest)
  
    __obj.asInstanceOf[UpdateSegmentRequest]
  }
}

