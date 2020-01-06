package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetUserPasswordRequest extends js.Object {
  /**
    * Identifier of the AWS Managed Microsoft AD or Simple AD directory in which the user resides.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId = js.native
  /**
    * The new password that will be reset.
    */
  var NewPassword: UserPassword = js.native
  /**
    * The user name of the user whose password will be reset.
    */
  var UserName: CustomerUserName = js.native
}

object ResetUserPasswordRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, NewPassword: UserPassword, UserName: CustomerUserName): ResetUserPasswordRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], NewPassword = NewPassword.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResetUserPasswordRequest]
  }
}

