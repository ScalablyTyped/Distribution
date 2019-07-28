package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeServerRequest extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId
}

object DescribeServerRequest {
  @scala.inline
  def apply(ServerId: ServerId): DescribeServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId)
  
    __obj.asInstanceOf[DescribeServerRequest]
  }
}

