package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingPlanResourcesRequest extends js.Object {
  /**
    * The maximum number of scalable resources to return. The value must be between 1 and 50. The default value is 50.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.autoscalingplansMod.MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.autoscalingplansMod.NextToken] = js.native
  /**
    * The name of the scaling plan.
    */
  var ScalingPlanName: typings.awsSdk.autoscalingplansMod.ScalingPlanName = js.native
  /**
    * The version number of the scaling plan.
    */
  var ScalingPlanVersion: typings.awsSdk.autoscalingplansMod.ScalingPlanVersion = js.native
}

object DescribeScalingPlanResourcesRequest {
  @scala.inline
  def apply(ScalingPlanName: ScalingPlanName, ScalingPlanVersion: ScalingPlanVersion): DescribeScalingPlanResourcesRequest = {
    val __obj = js.Dynamic.literal(ScalingPlanName = ScalingPlanName.asInstanceOf[js.Any], ScalingPlanVersion = ScalingPlanVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingPlanResourcesRequest]
  }
  @scala.inline
  implicit class DescribeScalingPlanResourcesRequestOps[Self <: DescribeScalingPlanResourcesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScalingPlanName(value: ScalingPlanName): Self = this.set("ScalingPlanName", value.asInstanceOf[js.Any])
    @scala.inline
    def setScalingPlanVersion(value: ScalingPlanVersion): Self = this.set("ScalingPlanVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

