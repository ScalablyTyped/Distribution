package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAccountSettingRequest extends js.Object {
  /**
    * The Amazon ECS resource name for which to modify the account setting. If serviceLongArnFormat is specified, the ARN for your Amazon ECS services is affected. If taskLongArnFormat is specified, the ARN and resource ID for your Amazon ECS tasks is affected. If containerInstanceLongArnFormat is specified, the ARN and resource ID for your Amazon ECS container instances is affected. If awsvpcTrunking is specified, the elastic network interface (ENI) limit for your Amazon ECS container instances is affected. If containerInsights is specified, the default setting for CloudWatch Container Insights for your clusters is affected.
    */
  var name: SettingName
  /**
    * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If you specify the root user, it modifies the account setting for all IAM users, IAM roles, and the root user of the account unless an IAM user or role explicitly overrides these settings. If this field is omitted, the setting is changed only for the authenticated user.
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

