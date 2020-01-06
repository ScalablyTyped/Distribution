package typings.awsDashSdk.clientsComputeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoScalingGroupRecommendationsResponse extends js.Object {
  /**
    * An array of objects that describe Auto Scaling group recommendations.
    */
  var autoScalingGroupRecommendations: js.UndefOr[AutoScalingGroupRecommendations] = js.native
  /**
    * An array of objects that describe errors of the request. For example, an error is returned if you request recommendations for an unsupported Auto Scaling group.
    */
  var errors: js.UndefOr[GetRecommendationErrors] = js.native
  /**
    * The token to use to advance to the next page of Auto Scaling group recommendations. This value is null when there are no more pages of Auto Scaling group recommendations to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetAutoScalingGroupRecommendationsResponse {
  @scala.inline
  def apply(
    autoScalingGroupRecommendations: AutoScalingGroupRecommendations = null,
    errors: GetRecommendationErrors = null,
    nextToken: NextToken = null
  ): GetAutoScalingGroupRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    if (autoScalingGroupRecommendations != null) __obj.updateDynamic("autoScalingGroupRecommendations")(autoScalingGroupRecommendations.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutoScalingGroupRecommendationsResponse]
  }
}

