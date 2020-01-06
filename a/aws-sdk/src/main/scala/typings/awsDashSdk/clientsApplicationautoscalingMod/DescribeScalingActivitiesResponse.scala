package typings.awsDashSdk.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingActivitiesResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  /**
    * A list of scaling activity objects.
    */
  var ScalingActivities: js.UndefOr[typings.awsDashSdk.clientsApplicationautoscalingMod.ScalingActivities] = js.native
}

object DescribeScalingActivitiesResponse {
  @scala.inline
  def apply(NextToken: XmlString = null, ScalingActivities: ScalingActivities = null): DescribeScalingActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScalingActivities != null) __obj.updateDynamic("ScalingActivities")(ScalingActivities.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingActivitiesResponse]
  }
}

