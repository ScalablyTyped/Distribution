package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTargetsForPolicyRequest extends js.Object {
  /**
    * A marker used to get the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.undefined
  /**
    * The maximum number of results to return at one time.
    */
  var pageSize: js.UndefOr[PageSize] = js.undefined
  /**
    * The policy name.
    */
  var policyName: PolicyName
}

object ListTargetsForPolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName, marker: Marker = null, pageSize: Int | Double = null): ListTargetsForPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTargetsForPolicyRequest]
  }
}

