package typings.awsDashSdk.clientsAppconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Monitor extends js.Object {
  /**
    * ARN of the Amazon CloudWatch alarm.
    */
  var AlarmArn: js.UndefOr[Arn] = js.native
  /**
    * ARN of an IAM role for AppConfig to monitor AlarmArn.
    */
  var AlarmRoleArn: js.UndefOr[Arn] = js.native
}

object Monitor {
  @scala.inline
  def apply(AlarmArn: Arn = null, AlarmRoleArn: Arn = null): Monitor = {
    val __obj = js.Dynamic.literal()
    if (AlarmArn != null) __obj.updateDynamic("AlarmArn")(AlarmArn.asInstanceOf[js.Any])
    if (AlarmRoleArn != null) __obj.updateDynamic("AlarmRoleArn")(AlarmRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Monitor]
  }
}

