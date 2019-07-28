package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecencyDimension extends js.Object {
  /**
    * The duration to use when determining whether an endpoint is active or inactive.
    */
  var Duration: typings.awsDashSdk.clientsPinpointMod.Duration
  /**
    * The type of recency dimension to use for the segment. Valid values are: ACTIVE, endpoints that were active within the specified duration are included in the segment; and, INACTIVE, endpoints that weren't active within the specified duration are included in the segment.
    */
  var RecencyType: typings.awsDashSdk.clientsPinpointMod.RecencyType
}

object RecencyDimension {
  @scala.inline
  def apply(Duration: Duration, RecencyType: RecencyType): RecencyDimension = {
    val __obj = js.Dynamic.literal(Duration = Duration.asInstanceOf[js.Any], RecencyType = RecencyType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecencyDimension]
  }
}

