package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRuleGroupsResponse extends js.Object {
  /**
    * If you have more RuleGroups than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RuleGroups, submit another ListRuleGroups request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.NextMarker] = js.native
  /**
    * An array of RuleGroup objects.
    */
  var RuleGroups: js.UndefOr[RuleGroupSummaries] = js.native
}

object ListRuleGroupsResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, RuleGroups: RuleGroupSummaries = null): ListRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (RuleGroups != null) __obj.updateDynamic("RuleGroups")(RuleGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRuleGroupsResponse]
  }
}

