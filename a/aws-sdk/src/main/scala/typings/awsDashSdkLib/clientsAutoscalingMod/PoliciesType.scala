package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoliciesType extends js.Object {
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  /**
    * The scaling policies.
    */
  var ScalingPolicies: js.UndefOr[ScalingPolicies] = js.undefined
}

object PoliciesType {
  @scala.inline
  def apply(NextToken: XmlString = null, ScalingPolicies: ScalingPolicies = null): PoliciesType = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScalingPolicies != null) __obj.updateDynamic("ScalingPolicies")(ScalingPolicies)
    __obj.asInstanceOf[PoliciesType]
  }
}

