package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAttachedPoliciesResponse extends js.Object {
  /**
    * The token to retrieve the next set of results, or ``null`` if there are no more results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  /**
    * The policies.
    */
  var policies: js.UndefOr[Policies] = js.native
}

object ListAttachedPoliciesResponse {
  @scala.inline
  def apply(nextMarker: Marker = null, policies: Policies = null): ListAttachedPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttachedPoliciesResponse]
  }
}

