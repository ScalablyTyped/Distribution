package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationConfigRuleStatus extends js.Object {
  var ErrorCode: js.UndefOr[String] = js.undefined
  var ErrorMessage: js.UndefOr[String] = js.undefined
  var LastUpdateTime: js.UndefOr[_Date] = js.undefined
  var OrganizationConfigRuleName: StringWithCharLimit64
  var OrganizationRuleStatus: awsDashSdkLib.clientsConfigserviceMod.OrganizationRuleStatus
}

object OrganizationConfigRuleStatus {
  @scala.inline
  def apply(
    OrganizationConfigRuleName: StringWithCharLimit64,
    OrganizationRuleStatus: OrganizationRuleStatus,
    ErrorCode: String = null,
    ErrorMessage: String = null,
    LastUpdateTime: _Date = null
  ): OrganizationConfigRuleStatus = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName, OrganizationRuleStatus = OrganizationRuleStatus.asInstanceOf[js.Any])
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (LastUpdateTime != null) __obj.updateDynamic("LastUpdateTime")(LastUpdateTime)
    __obj.asInstanceOf[OrganizationConfigRuleStatus]
  }
}

