package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSegmentVersionRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
  /**
    * The unique identifier for the segment.
    */
  var SegmentId: __string = js.native
  /**
    * The unique version number (Version property) for the campaign version.
    */
  var Version: __string = js.native
}

object GetSegmentVersionRequest {
  @scala.inline
  def apply(ApplicationId: __string, SegmentId: __string, Version: __string): GetSegmentVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSegmentVersionRequest]
  }
}

