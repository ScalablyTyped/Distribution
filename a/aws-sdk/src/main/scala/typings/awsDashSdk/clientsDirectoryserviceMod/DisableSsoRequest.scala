package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableSsoRequest extends js.Object {
  /**
    * The identifier of the directory for which to disable single-sign on.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
  /**
    * The password of an alternate account to use to disable single-sign on. This is only used for AD Connector directories. For more information, see the UserName parameter.
    */
  var Password: js.UndefOr[ConnectPassword] = js.undefined
  /**
    * The username of an alternate account to use to disable single-sign on. This is only used for AD Connector directories. This account must have privileges to remove a service principal name. If the AD Connector service account does not have privileges to remove a service principal name, you can specify an alternate account with the UserName and Password parameters. These credentials are only used to disable single sign-on and are not stored by the service. The AD Connector service account is not changed.
    */
  var UserName: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.UserName] = js.undefined
}

object DisableSsoRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, Password: ConnectPassword = null, UserName: UserName = null): DisableSsoRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId)
    if (Password != null) __obj.updateDynamic("Password")(Password)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[DisableSsoRequest]
  }
}

