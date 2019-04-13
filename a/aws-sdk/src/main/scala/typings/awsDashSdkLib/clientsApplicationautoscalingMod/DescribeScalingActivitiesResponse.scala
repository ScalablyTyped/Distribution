package typings
package awsDashSdkLib.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScalingActivitiesResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  /**
    * A list of scaling activity objects.
    */
  var ScalingActivities: js.UndefOr[ScalingActivities] = js.undefined
}

object DescribeScalingActivitiesResponse {
  @scala.inline
  def apply(NextToken: XmlString = null, ScalingActivities: ScalingActivities = null): DescribeScalingActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScalingActivities != null) __obj.updateDynamic("ScalingActivities")(ScalingActivities)
    __obj.asInstanceOf[DescribeScalingActivitiesResponse]
  }
}

