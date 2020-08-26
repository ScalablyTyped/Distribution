package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSetting extends js.Object {
  /**
    * The action that is enabled or disabled.
    */
  var Action: typings.awsSdk.appstreamMod.Action = js.native
  /**
    * Indicates whether the action is enabled or disabled.
    */
  var Permission: typings.awsSdk.appstreamMod.Permission = js.native
}

object UserSetting {
  @scala.inline
  def apply(Action: Action, Permission: Permission): UserSetting = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSetting]
  }
  @scala.inline
  implicit class UserSettingOps[Self <: UserSetting] (val x: Self) extends AnyVal {
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
    def setAction(value: Action): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermission(value: Permission): Self = this.set("Permission", value.asInstanceOf[js.Any])
  }
  
}

