package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTargetGroupsOutput extends js.Object {
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
  /**
    * Information about the target groups.
    */
  var TargetGroups: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.TargetGroups] = js.native
}

object DescribeTargetGroupsOutput {
  @scala.inline
  def apply(NextMarker: Marker = null, TargetGroups: TargetGroups = null): DescribeTargetGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (TargetGroups != null) __obj.updateDynamic("TargetGroups")(TargetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTargetGroupsOutput]
  }
}

