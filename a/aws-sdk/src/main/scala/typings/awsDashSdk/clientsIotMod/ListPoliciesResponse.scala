package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPoliciesResponse extends js.Object {
  /**
    * The marker for the next set of results, or null if there are no additional results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
  /**
    * The descriptions of the policies.
    */
  var policies: js.UndefOr[Policies] = js.undefined
}

object ListPoliciesResponse {
  @scala.inline
  def apply(nextMarker: Marker = null, policies: Policies = null): ListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker)
    if (policies != null) __obj.updateDynamic("policies")(policies)
    __obj.asInstanceOf[ListPoliciesResponse]
  }
}

