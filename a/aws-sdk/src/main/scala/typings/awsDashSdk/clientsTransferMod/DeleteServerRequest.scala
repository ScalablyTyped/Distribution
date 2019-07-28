package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteServerRequest extends js.Object {
  /**
    * A unique system-assigned identifier for an SFTP server instance.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId
}

object DeleteServerRequest {
  @scala.inline
  def apply(ServerId: ServerId): DeleteServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId)
  
    __obj.asInstanceOf[DeleteServerRequest]
  }
}

