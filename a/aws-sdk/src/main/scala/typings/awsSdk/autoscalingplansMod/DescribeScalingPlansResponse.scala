package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingPlansResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.autoscalingplansMod.NextToken] = js.native
  /**
    * Information about the scaling plans.
    */
  var ScalingPlans: js.UndefOr[typings.awsSdk.autoscalingplansMod.ScalingPlans] = js.native
}

object DescribeScalingPlansResponse {
  @scala.inline
  def apply(): DescribeScalingPlansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingPlansResponse]
  }
  @scala.inline
  implicit class DescribeScalingPlansResponseOps[Self <: DescribeScalingPlansResponse] (val x: Self) extends AnyVal {
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
    def setScalingPlansVarargs(value: ScalingPlan*): Self = this.set("ScalingPlans", js.Array(value :_*))
    @scala.inline
    def setScalingPlans(value: ScalingPlans): Self = this.set("ScalingPlans", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalingPlans: Self = this.set("ScalingPlans", js.undefined)
  }
  
}

