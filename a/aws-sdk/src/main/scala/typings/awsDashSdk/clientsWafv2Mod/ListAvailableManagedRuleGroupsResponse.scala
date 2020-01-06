package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAvailableManagedRuleGroupsResponse extends js.Object {
  /**
    * 
    */
  var ManagedRuleGroups: js.UndefOr[ManagedRuleGroupSummaries] = js.native
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafv2Mod.NextMarker] = js.native
}

object ListAvailableManagedRuleGroupsResponse {
  @scala.inline
  def apply(ManagedRuleGroups: ManagedRuleGroupSummaries = null, NextMarker: NextMarker = null): ListAvailableManagedRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (ManagedRuleGroups != null) __obj.updateDynamic("ManagedRuleGroups")(ManagedRuleGroups.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAvailableManagedRuleGroupsResponse]
  }
}

