package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountAuditConfigurationResponse extends js.Object {
  /**
    * Which audit checks are enabled and disabled for this account.
    */
  var auditCheckConfigurations: js.UndefOr[AuditCheckConfigurations] = js.undefined
  /**
    * Information about the targets to which audit notifications are sent for this account.
    */
  var auditNotificationTargetConfigurations: js.UndefOr[AuditNotificationTargetConfigurations] = js.undefined
  /**
    * The ARN of the role that grants permission to AWS IoT to access information about your devices, policies, certificates and other items as necessary when performing an audit. On the first call to UpdateAccountAuditConfiguration this parameter is required.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}

object DescribeAccountAuditConfigurationResponse {
  @scala.inline
  def apply(
    auditCheckConfigurations: AuditCheckConfigurations = null,
    auditNotificationTargetConfigurations: AuditNotificationTargetConfigurations = null,
    roleArn: RoleArn = null
  ): DescribeAccountAuditConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (auditCheckConfigurations != null) __obj.updateDynamic("auditCheckConfigurations")(auditCheckConfigurations)
    if (auditNotificationTargetConfigurations != null) __obj.updateDynamic("auditNotificationTargetConfigurations")(auditNotificationTargetConfigurations)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[DescribeAccountAuditConfigurationResponse]
  }
}

