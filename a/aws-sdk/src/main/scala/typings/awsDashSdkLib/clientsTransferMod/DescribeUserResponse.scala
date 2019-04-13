package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserResponse extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server that has this user assigned.
    */
  var ServerId: awsDashSdkLib.clientsTransferMod.ServerId
  /**
    * An array containing the properties of the user account for the ServerID value that you specified.
    */
  var User: DescribedUser
}

object DescribeUserResponse {
  @scala.inline
  def apply(ServerId: ServerId, User: DescribedUser): DescribeUserResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId, User = User)
  
    __obj.asInstanceOf[DescribeUserResponse]
  }
}

