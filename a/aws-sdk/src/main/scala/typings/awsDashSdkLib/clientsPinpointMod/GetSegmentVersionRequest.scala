package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSegmentVersionRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  /**
    * The unique ID of the segment.
    */
  var SegmentId: __string
  /**
    * The segment version.
    */
  var Version: __string
}

object GetSegmentVersionRequest {
  @scala.inline
  def apply(ApplicationId: __string, SegmentId: __string, Version: __string): GetSegmentVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, SegmentId = SegmentId, Version = Version)
  
    __obj.asInstanceOf[GetSegmentVersionRequest]
  }
}

