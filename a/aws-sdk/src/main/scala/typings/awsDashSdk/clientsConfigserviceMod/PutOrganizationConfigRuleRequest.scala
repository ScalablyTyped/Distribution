package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutOrganizationConfigRuleRequest extends js.Object {
  /**
    * A comma-separated list of accounts that you want to exclude from an organization config rule.
    */
  var ExcludedAccounts: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ExcludedAccounts] = js.undefined
  /**
    * The name that you assign to an organization config rule.
    */
  var OrganizationConfigRuleName: StringWithCharLimit64
  /**
    * An OrganizationCustomRuleMetadata object.
    */
  var OrganizationCustomRuleMetadata: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationCustomRuleMetadata] = js.undefined
  /**
    * An OrganizationManagedRuleMetadata object. 
    */
  var OrganizationManagedRuleMetadata: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationManagedRuleMetadata] = js.undefined
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

