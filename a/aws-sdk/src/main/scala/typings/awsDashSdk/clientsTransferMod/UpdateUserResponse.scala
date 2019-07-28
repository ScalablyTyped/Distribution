package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserResponse extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server instance that the user account is assigned to.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId
  /**
    * The unique identifier for a user that is assigned to the SFTP server instance that was specified in the request.
    */
  var UserName: typings.awsDashSdk.clientsTransferMod.UserName
}

object UpdateUserResponse {
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName): UpdateUserResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId, UserName = UserName)
  
    __obj.asInstanceOf[UpdateUserResponse]
  }
}

