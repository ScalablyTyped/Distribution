package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAccountAuditConfigurationRequest extends js.Object {
  /**
    * Specifies which audit checks are enabled and disabled for this account. Use DescribeAccountAuditConfiguration to see the list of all checks, including those that are currently enabled. Some data collection might start immediately when certain checks are enabled. When a check is disabled, any data collected so far in relation to the check is deleted. You cannot disable a check if it is used by any scheduled audit. You must first delete the check from the scheduled audit or delete the scheduled audit itself. On the first call to UpdateAccountAuditConfiguration, this parameter is required and must specify at least one enabled check.
    */
  var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.undefined
  /**
    * Information about the targets to which audit notifications are sent.
    */
  var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.undefined
  /**
    * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies, certificates and other items as required when performing an audit.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}

object UpdateAccountAuditConfigurationRequest {
  @scala.inline
  def apply(
    auditCheckConfigurations: AuditCheckConfigurations = null,
    auditNotificationTargetConfigurations: AuditNotificationTargetConfigurations = null,
    roleArn: RoleArn = null
  ): UpdateAccountAuditConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (auditCheckConfigurations != null) __obj.updateDynamic("auditCheckConfigurations")(auditCheckConfigurations)
    if (auditNotificationTargetConfigurations != null) __obj.updateDynamic("auditNotificationTargetConfigurations")(auditNotificationTargetConfigurations)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[UpdateAccountAuditConfigurationRequest]
  }
}

