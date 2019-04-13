package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSegmentRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  var WriteSegmentRequest: awsDashSdkLib.clientsPinpointMod.WriteSegmentRequest
}

object CreateSegmentRequest {
  @scala.inline
  def apply(ApplicationId: __string, WriteSegmentRequest: WriteSegmentRequest): CreateSegmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, WriteSegmentRequest = WriteSegmentRequest)
  
    __obj.asInstanceOf[CreateSegmentRequest]
  }
}

