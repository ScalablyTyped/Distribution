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
  def apply(NextToken: XmlString = null, ScalableTargets: ScalableTargets = null): DescribeScalableTargetsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScalableTargets != null) __obj.updateDynamic("ScalableTargets")(ScalableTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalableTargetsResponse]
  }
}

