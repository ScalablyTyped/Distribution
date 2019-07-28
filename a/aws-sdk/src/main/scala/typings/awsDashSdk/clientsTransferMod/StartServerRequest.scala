package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartServerRequest extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server that you start.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId
}

object StartServerRequest {
  @scala.inline
  def apply(ServerId: ServerId): StartServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId)
  
    __obj.asInstanceOf[StartServerRequest]
  }
}

