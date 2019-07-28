package typings.awsDashSdk.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScalableTargetsResponse extends js.Object {
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  /**
    * The scalable targets that match the request parameters.
    */
  var ScalableTargets: js.UndefOr[typings.awsDashSdk.clientsApplicationautoscalingMod.ScalableTargets] = js.undefined
}

object DescribeScalableTargetsResponse {
  @scala.inline
  def apply(NextToken: XmlString = null, ScalableTargets: ScalableTargets = null): DescribeScalableTargetsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScalableTargets != null) __obj.updateDynamic("ScalableTargets")(ScalableTargets)
    __obj.asInstanceOf[DescribeScalableTargetsResponse]
  }
}

