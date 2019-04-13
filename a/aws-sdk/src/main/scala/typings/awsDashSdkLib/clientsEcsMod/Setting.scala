package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setting extends js.Object {
  /**
    * The account resource name.
    */
  var name: js.UndefOr[SettingName] = js.undefined
  /**
    * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted, the authenticated user is assumed.
    */
  var principalArn: js.UndefOr[String] = js.undefined
  /**
    * The current account setting for the resource name. If enabled, the resource receives the new Amazon Resource Name (ARN) and resource identifier (ID) format. If disabled, the resource receives the old Amazon Resource Name (ARN) and resource identifier (ID) format.
    */
  var value: js.UndefOr[String] = js.undefined
}

object Setting {
  @scala.inline
  def apply(name: SettingName = null, principalArn: String = null, value: String = null): Setting = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (principalArn != null) __obj.updateDynamic("principalArn")(principalArn)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Setting]
  }
}

