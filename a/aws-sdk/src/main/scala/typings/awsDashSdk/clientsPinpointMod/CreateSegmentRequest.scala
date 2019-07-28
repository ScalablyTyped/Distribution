package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSegmentRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  var WriteSegmentRequest: typings.awsDashSdk.clientsPinpointMod.WriteSegmentRequest
}

object CreateSegmentRequest {
  @scala.inline
  def apply(ApplicationId: __string, WriteSegmentRequest: WriteSegmentRequest): CreateSegmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, WriteSegmentRequest = WriteSegmentRequest)
  
    __obj.asInstanceOf[CreateSegmentRequest]
  }
}

