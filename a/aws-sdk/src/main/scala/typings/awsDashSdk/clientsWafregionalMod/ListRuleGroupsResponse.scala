package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRuleGroupsResponse extends js.Object {
  /**
    * If you have more RuleGroups than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RuleGroups, submit another ListRuleGroups request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.NextMarker] = js.undefined
  /**
    * An array of RuleGroup objects.
    */
  var RuleGroups: js.UndefOr[RuleGroupSummaries] = js.undefined
}

object ListRuleGroupsResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, RuleGroups: RuleGroupSummaries = null): ListRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (RuleGroups != null) __obj.updateDynamic("RuleGroups")(RuleGroups)
    __obj.asInstanceOf[ListRuleGroupsResponse]
  }
}

