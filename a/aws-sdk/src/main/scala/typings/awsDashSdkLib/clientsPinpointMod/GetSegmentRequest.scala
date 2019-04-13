package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSegmentRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  /**
    * The unique ID of the segment.
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

