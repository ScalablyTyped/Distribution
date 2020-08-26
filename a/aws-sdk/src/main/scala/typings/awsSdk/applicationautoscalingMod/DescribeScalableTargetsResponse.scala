package typings.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalableTargetsResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  /**
    * The scalable targets that match the request parameters.
    */
  var ScalableTargets: js.UndefOr[typings.awsSdk.applicationautoscalingMod.ScalableTargets] = js.native
}

object DescribeScalableTargetsResponse {
  @scala.inline
  def apply(): DescribeScalableTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalableTargetsResponse]
  }
  @scala.inline
  implicit class DescribeScalableTargetsResponseOps[Self <: DescribeScalableTargetsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: XmlString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setScalableTargetsVarargs(value: ScalableTarget*): Self = this.set("ScalableTargets", js.Array(value :_*))
    @scala.inline
    def setScalableTargets(value: ScalableTargets): Self = this.set("ScalableTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalableTargets: Self = this.set("ScalableTargets", js.undefined)
  }
  
}

