package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIdentityProviderRequest extends js.Object {
  /**
    * A system assigned identifier for a specific server. That server's user authentication method is tested with a user name and password.
    */
  var ServerId: awsDashSdkLib.clientsTransferMod.ServerId
  /**
    * This request parameter is name of the user account to be tested.
    */
  var UserName: awsDashSdkLib.clientsTransferMod.UserName
  /**
    * The password of the user account to be tested.
    */
  var UserPassword: js.UndefOr[UserPassword] = js.undefined
}

object TestIdentityProviderRequest {
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName, UserPassword: UserPassword = null): TestIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId, UserName = UserName)
    if (UserPassword != null) __obj.updateDynamic("UserPassword")(UserPassword)
    __obj.asInstanceOf[TestIdentityProviderRequest]
  }
}

