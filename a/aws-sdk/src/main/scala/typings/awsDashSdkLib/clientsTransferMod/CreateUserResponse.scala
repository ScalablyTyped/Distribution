package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserResponse extends js.Object {
  /**
    * The ID of the SFTP server that the user is attached to.
    */
  var ServerId: awsDashSdkLib.clientsTransferMod.ServerId
  /**
    * A unique string that identifies a user account associated with an SFTP server.
    */
  var UserName: awsDashSdkLib.clientsTransferMod.UserName
}

object CreateUserResponse {
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName): CreateUserResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId, UserName = UserName)
  
    __obj.asInstanceOf[CreateUserResponse]
  }
}

