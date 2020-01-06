package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleGroupReferenceStatement extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: ResourceArn = js.native
  /**
    * The names of rules that are in the referenced rule group, but that you want AWS WAF to exclude from processing for this rule statement. 
    */
  var ExcludedRules: js.UndefOr[typings.awsDashSdk.clientsWafv2Mod.ExcludedRules] = js.native
}

object RuleGroupReferenceStatement {
  @scala.inline
  def apply(ARN: ResourceArn, ExcludedRules: ExcludedRules = null): RuleGroupReferenceStatement = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any])
    if (ExcludedRules != null) __obj.updateDynamic("ExcludedRules")(ExcludedRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupReferenceStatement]
  }
}

