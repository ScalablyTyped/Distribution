package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationConfigRule extends js.Object {
  /**
    * A comma-separated list of accounts excluded from organization config rule.
    */
  var ExcludedAccounts: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ExcludedAccounts] = js.undefined
  /**
    * The timestamp of the last update.
    */
  var LastUpdateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of organization config rule.
    */
  var OrganizationConfigRuleArn: StringWithCharLimit256
  /**
    * The name that you assign to organization config rule.
    */
  var OrganizationConfigRuleName: typings.awsDashSdk.clientsConfigserviceMod.OrganizationConfigRuleName
  /**
    * An OrganizationCustomRuleMetadata object.
    */
  var OrganizationCustomRuleMetadata: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationCustomRuleMetadata] = js.undefined
  /**
    * An OrganizationManagedRuleMetadata object.
    */
  var OrganizationManagedRuleMetadata: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationManagedRuleMetadata] = js.undefined
}

object OrganizationConfigRule {
  @scala.inline
  def apply(
    OrganizationConfigRuleArn: StringWithCharLimit256,
    OrganizationConfigRuleName: OrganizationConfigRuleName,
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

