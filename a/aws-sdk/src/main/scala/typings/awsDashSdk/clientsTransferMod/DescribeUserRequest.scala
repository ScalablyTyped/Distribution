package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserRequest extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server that has this user assigned.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId
  /**
    * The name of the user assigned to one or more servers. User names are part of the sign-in credentials to use the AWS Transfer for SFTP service and perform file transfer tasks.
    */
  var UserName: typings.awsDashSdk.clientsTransferMod.UserName
}

object DescribeUserRequest {
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName): DescribeUserRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId, UserName = UserName)
  
    __obj.asInstanceOf[DescribeUserRequest]
  }
}

