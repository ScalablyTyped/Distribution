package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTargetGroupsOutput extends js.Object {
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
  /**
    * Information about the target groups.
    */
  var TargetGroups: js.UndefOr[TargetGroups] = js.undefined
}

object DescribeTargetGroupsOutput {
  @scala.inline
  def apply(NextMarker: Marker = null, TargetGroups: TargetGroups = null): DescribeTargetGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (TargetGroups != null) __obj.updateDynamic("TargetGroups")(TargetGroups)
    __obj.asInstanceOf[DescribeTargetGroupsOutput]
  }
}

