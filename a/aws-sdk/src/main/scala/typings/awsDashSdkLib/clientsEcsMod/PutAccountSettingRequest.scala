package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAccountSettingRequest extends js.Object {
  /**
    * The resource name for which to enable the new format. If serviceLongArnFormat is specified, the ARN for your Amazon ECS services is affected. If taskLongArnFormat is specified, the ARN and resource ID for your Amazon ECS tasks is affected. If containerInstanceLongArnFormat is specified, the ARN and resource ID for your Amazon ECS container instances is affected.
    */
  var name: SettingName
  /**
    * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If you specify the root user, it modifies the ARN and resource ID format for all IAM users, IAM roles, and the root user of the account unless an IAM user or role explicitly overrides these settings for themselves. If this field is omitted, the settings are changed only for the authenticated user.
    */
  var principalArn: js.UndefOr[String] = js.undefined
  /**
    * The account setting value for the specified principal ARN. Accepted values are enabled and disabled.
    */
  var value: String
}

object PutAccountSettingRequest {
  @scala.inline
  def apply(name: SettingName, value: String, principalArn: String = null): PutAccountSettingRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value)
    if (principalArn != null) __obj.updateDynamic("principalArn")(principalArn)
    __obj.asInstanceOf[PutAccountSettingRequest]
  }
}

