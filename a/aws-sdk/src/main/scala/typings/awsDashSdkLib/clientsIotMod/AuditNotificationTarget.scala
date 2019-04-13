package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditNotificationTarget extends js.Object {
  /**
    * True if notifications to the target are enabled.
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
  /**
    * The ARN of the role that grants permission to send notifications to the target.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * The ARN of the target (SNS topic) to which audit notifications are sent.
    */
  var targetArn: js.UndefOr[TargetArn] = js.undefined
}

object AuditNotificationTarget {
  @scala.inline
  def apply(enabled: js.UndefOr[Enabled] = js.undefined, roleArn: RoleArn = null, targetArn: TargetArn = null): AuditNotificationTarget = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (targetArn != null) __obj.updateDynamic("targetArn")(targetArn)
    __obj.asInstanceOf[AuditNotificationTarget]
  }
}

