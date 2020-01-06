package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopServerRequest extends js.Object {
  /**
    * A system-assigned unique identifier for an SFTP server that you stopped.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId = js.native
}

object StopServerRequest {
  @scala.inline
  def apply(ServerId: ServerId): StopServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopServerRequest]
  }
}

