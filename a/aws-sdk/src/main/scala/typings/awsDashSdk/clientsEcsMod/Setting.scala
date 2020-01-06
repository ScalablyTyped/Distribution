package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Setting extends js.Object {
  /**
    * The Amazon ECS resource name.
    */
  var name: js.UndefOr[SettingName] = js.native
  /**
    * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted, the authenticated user is assumed.
    */
  var principalArn: js.UndefOr[String] = js.native
  /**
    * Whether the account setting is enabled or disabled for the specified resource.
    */
  var value: js.UndefOr[String] = js.native
}

object Setting {
  @scala.inline
  def apply(name: SettingName = null, principalArn: String = null, value: String = null): Setting = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (principalArn != null) __obj.updateDynamic("principalArn")(principalArn.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Setting]
  }
}

