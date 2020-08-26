package typings.awsSdk.appconfigMod

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
  var AlarmRoleArn: js.UndefOr[RoleArn] = js.native
}

object Monitor {
  @scala.inline
  def apply(): Monitor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Monitor]
  }
  @scala.inline
  implicit class MonitorOps[Self <: Monitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlarmArn(value: Arn): Self = this.set("AlarmArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlarmArn: Self = this.set("AlarmArn", js.undefined)
    @scala.inline
    def setAlarmRoleArn(value: RoleArn): Self = this.set("AlarmRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlarmRoleArn: Self = this.set("AlarmRoleArn", js.undefined)
  }
  
}

