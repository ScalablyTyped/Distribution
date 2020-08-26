package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingPlanResourcesResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.autoscalingplansMod.NextToken] = js.native
  /**
    * Information about the scalable resources.
    */
  var ScalingPlanResources: js.UndefOr[typings.awsSdk.autoscalingplansMod.ScalingPlanResources] = js.native
}

object DescribeScalingPlanResourcesResponse {
  @scala.inline
  def apply(): DescribeScalingPlanResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingPlanResourcesResponse]
  }
  @scala.inline
  implicit class DescribeScalingPlanResourcesResponseOps[Self <: DescribeScalingPlanResourcesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setScalingPlanResourcesVarargs(value: ScalingPlanResource*): Self = this.set("ScalingPlanResources", js.Array(value :_*))
    @scala.inline
    def setScalingPlanResources(value: ScalingPlanResources): Self = this.set("ScalingPlanResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalingPlanResources: Self = this.set("ScalingPlanResources", js.undefined)
  }
  
}

