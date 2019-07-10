package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutOrganizationConfigRuleRequest extends js.Object {
  var ExcludedAccounts: js.UndefOr[ExcludedAccounts] = js.undefined
  var OrganizationConfigRuleName: StringWithCharLimit64
  var OrganizationCustomRuleMetadata: js.UndefOr[OrganizationCustomRuleMetadata] = js.undefined
  var OrganizationManagedRuleMetadata: js.UndefOr[OrganizationManagedRuleMetadata] = js.undefined
}

object PutOrganizationConfigRuleRequest {
  @scala.inline
  def apply(
    OrganizationConfigRuleName: StringWithCharLimit64,
    ExcludedAccounts: ExcludedAccounts = null,
    OrganizationCustomRuleMetadata: OrganizationCustomRuleMetadata = null,
    OrganizationManagedRuleMetadata: OrganizationManagedRuleMetadata = null
  ): PutOrganizationConfigRuleRequest = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName)
    if (ExcludedAccounts != null) __obj.updateDynamic("ExcludedAccounts")(ExcludedAccounts)
    if (OrganizationCustomRuleMetadata != null) __obj.updateDynamic("OrganizationCustomRuleMetadata")(OrganizationCustomRuleMetadata)
    if (OrganizationManagedRuleMetadata != null) __obj.updateDynamic("OrganizationManagedRuleMetadata")(OrganizationManagedRuleMetadata)
    __obj.asInstanceOf[PutOrganizationConfigRuleRequest]
  }
}

