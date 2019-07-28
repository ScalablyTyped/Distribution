package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServerResponse extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server that the user account is assigned to.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId
}

object UpdateServerResponse {
  @scala.inline
  def apply(ServerId: ServerId): UpdateServerResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId)
  
    __obj.asInstanceOf[UpdateServerResponse]
  }
}

