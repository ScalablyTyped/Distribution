package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberFabricConfiguration extends js.Object {
  /**
    * The password for the member's initial administrative user. The AdminPassword must be at least eight characters long and no more than 32 characters. It must contain at least one uppercase letter, one lowercase letter, and one digit. It cannot have a single quote(‘), double quote(“), forward slash(/), backward slash(\), @, or a space.
    */
  var AdminPassword: PasswordString = js.native
  /**
    * The user name for the member's initial administrative user.
    */
  var AdminUsername: UsernameString = js.native
}

object MemberFabricConfiguration {
  @scala.inline
  def apply(AdminPassword: PasswordString, AdminUsername: UsernameString): MemberFabricConfiguration = {
    val __obj = js.Dynamic.literal(AdminPassword = AdminPassword.asInstanceOf[js.Any], AdminUsername = AdminUsername.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MemberFabricConfiguration]
  }
}

