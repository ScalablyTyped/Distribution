package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAttachedPoliciesResponse extends js.Object {
  /**
    * The token to retrieve the next set of results, or ``null`` if there are no more results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
  /**
    * The policies.
    */
  var policies: js.UndefOr[Policies] = js.undefined
}

object ListAttachedPoliciesResponse {
  @scala.inline
  def apply(nextMarker: Marker = null, policies: Policies = null): ListAttachedPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker)
    if (policies != null) __obj.updateDynamic("policies")(policies)
    __obj.asInstanceOf[ListAttachedPoliciesResponse]
  }
}

