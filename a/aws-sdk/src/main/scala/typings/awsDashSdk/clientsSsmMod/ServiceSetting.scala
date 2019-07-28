package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceSetting extends js.Object {
  /**
    * The ARN of the service setting.
    */
  var ARN: js.UndefOr[String] = js.undefined
  /**
    * The last time the service setting was modified.
    */
  var LastModifiedDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The ARN of the last modified user. This field is populated only if the setting value was overwritten.
    */
  var LastModifiedUser: js.UndefOr[String] = js.undefined
  /**
    * The ID of the service setting.
    */
  var SettingId: js.UndefOr[ServiceSettingId] = js.undefined
  /**
    * The value of the service setting.
    */
  var SettingValue: js.UndefOr[ServiceSettingValue] = js.undefined
  /**
    * The status of the service setting. The value can be Default, Customized or PendingUpdate.   Default: The current setting uses a default value provisioned by the AWS service team.   Customized: The current setting use a custom value specified by the customer.   PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending approval.  
    */
  var Status: js.UndefOr[String] = js.undefined
}

object ServiceSetting {
  @scala.inline
  def apply(
    ARN: String = null,
    LastModifiedDate: DateTime = null,
    LastModifiedUser: String = null,
    SettingId: ServiceSettingId = null,
    SettingValue: ServiceSettingValue = null,
    Status: String = null
  ): ServiceSetting = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (LastModifiedUser != null) __obj.updateDynamic("LastModifiedUser")(LastModifiedUser)
    if (SettingId != null) __obj.updateDynamic("SettingId")(SettingId)
    if (SettingValue != null) __obj.updateDynamic("SettingValue")(SettingValue)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[ServiceSetting]
  }
}

