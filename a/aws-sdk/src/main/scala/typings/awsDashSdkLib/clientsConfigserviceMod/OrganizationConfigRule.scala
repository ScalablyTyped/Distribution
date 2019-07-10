package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationConfigRule extends js.Object {
  var ExcludedAccounts: js.UndefOr[ExcludedAccounts] = js.undefined
  var LastUpdateTime: js.UndefOr[_Date] = js.undefined
  var OrganizationConfigRuleArn: StringWithCharLimit256
  var OrganizationConfigRuleName: StringWithCharLimit64
  var OrganizationCustomRuleMetadata: js.UndefOr[OrganizationCustomRuleMetadata] = js.undefined
  var OrganizationManagedRuleMetadata: js.UndefOr[OrganizationManagedRuleMetadata] = js.undefined
}

object OrganizationConfigRule {
  @scala.inline
  def apply(
    OrganizationConfigRuleArn: StringWithCharLimit256,
    OrganizationConfigRuleName: StringWithCharLimit64,
    ExcludedAccounts: ExcludedAccounts = null,
    LastUpdateTime: _Date = null,
    OrganizationCustomRuleMetadata: OrganizationCustomRuleMetadata = null,
    OrganizationManagedRuleMetadata: OrganizationManagedRuleMetadata = null
  ): OrganizationConfigRule = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleArn = OrganizationConfigRuleArn, OrganizationConfigRuleName = OrganizationConfigRuleName)
    if (ExcludedAccounts != null) __obj.updateDynamic("ExcludedAccounts")(ExcludedAccounts)
    if (LastUpdateTime != null) __obj.updateDynamic("LastUpdateTime")(LastUpdateTime)
    if (OrganizationCustomRuleMetadata != null) __obj.updateDynamic("OrganizationCustomRuleMetadata")(OrganizationCustomRuleMetadata)
    if (OrganizationManagedRuleMetadata != null) __obj.updateDynamic("OrganizationManagedRuleMetadata")(OrganizationManagedRuleMetadata)
    __obj.asInstanceOf[OrganizationConfigRule]
  }
}

