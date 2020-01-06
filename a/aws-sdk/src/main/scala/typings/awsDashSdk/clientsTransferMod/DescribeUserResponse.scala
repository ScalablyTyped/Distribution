package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserResponse extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server that has this user assigned.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId = js.native
  /**
    * An array containing the properties of the user account for the ServerID value that you specified.
    */
  var User: DescribedUser = js.native
}

object DescribeUserResponse {
  @scala.inline
  def apply(ServerId: ServerId, User: DescribedUser): DescribeUserResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeUserResponse]
  }
}

