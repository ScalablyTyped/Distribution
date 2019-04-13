package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetUserPasswordRequest extends js.Object {
  /**
    * Identifier of the AWS Managed Microsoft AD or Simple AD directory in which the user resides.
    */
  var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryId
  /**
    * The new password that will be reset.
    */
  var NewPassword: UserPassword
  /**
    * The user name of the user whose password will be reset.
    */
  var UserName: CustomerUserName
}

object ResetUserPasswordRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, NewPassword: UserPassword, UserName: CustomerUserName): ResetUserPasswordRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId, NewPassword = NewPassword, UserName = UserName)
  
    __obj.asInstanceOf[ResetUserPasswordRequest]
  }
}

