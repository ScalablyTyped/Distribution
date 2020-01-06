package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedRuleGroupStatement extends js.Object {
  /**
    * The rules whose actions are set to COUNT by the web ACL, regardless of the action that is set on the rule. This effectively excludes the rule from acting on web requests. 
    */
  var ExcludedRules: js.UndefOr[typings.awsDashSdk.clientsWafv2Mod.ExcludedRules] = js.native
  /**
    * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
    */
  var Name: EntityName = js.native
  /**
    * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule group.
    */
  var VendorName: typings.awsDashSdk.clientsWafv2Mod.VendorName = js.native
}

object ManagedRuleGroupStatement {
  @scala.inline
  def apply(Name: EntityName, VendorName: VendorName, ExcludedRules: ExcludedRules = null): ManagedRuleGroupStatement = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], VendorName = VendorName.asInstanceOf[js.Any])
    if (ExcludedRules != null) __obj.updateDynamic("ExcludedRules")(ExcludedRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedRuleGroupStatement]
  }
}

