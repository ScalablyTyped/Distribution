package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrafficMirrorTargetsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about one or more Traffic Mirror targets.
    */
  var TrafficMirrorTargets: js.UndefOr[TrafficMirrorTargetSet] = js.native
}

object DescribeTrafficMirrorTargetsResult {
  @scala.inline
  def apply(NextToken: String = null, TrafficMirrorTargets: TrafficMirrorTargetSet = null): DescribeTrafficMirrorTargetsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TrafficMirrorTargets != null) __obj.updateDynamic("TrafficMirrorTargets")(TrafficMirrorTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrafficMirrorTargetsResult]
  }
}

