package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTargetsRequest extends js.Object {
  /**
    * If this is a managed rule, created by an AWS service on your behalf, you must specify Force as True to remove targets. This parameter is ignored for rules that are not managed rules. You can check whether a rule is a managed rule by using DescribeRule or ListRules and checking the ManagedBy field of the response.
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  /**
    * The IDs of the targets to remove from the rule.
    */
  var Ids: TargetIdList
  /**
    * The name of the rule.
    */
  var Rule: RuleName
}

object RemoveTargetsRequest {
  @scala.inline
  def apply(Ids: TargetIdList, Rule: RuleName, Force: js.UndefOr[Boolean] = js.undefined): RemoveTargetsRequest = {
    val __obj = js.Dynamic.literal(Ids = Ids, Rule = Rule)
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force)
    __obj.asInstanceOf[RemoveTargetsRequest]
  }
}

