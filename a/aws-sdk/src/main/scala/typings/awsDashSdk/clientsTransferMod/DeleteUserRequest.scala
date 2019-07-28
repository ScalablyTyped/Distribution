package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserRequest extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server instance that has the user assigned to it.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId
  /**
    * A unique string that identifies a user that is being deleted from the server.
    */
  var UserName: typings.awsDashSdk.clientsTransferMod.UserName
}

object DeleteUserRequest {
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId, UserName = UserName)
  
    __obj.asInstanceOf[DeleteUserRequest]
  }
}

