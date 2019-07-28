package typings.awsDashSdk.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServerResponse extends js.Object {
  /**
    * The service-assigned ID of the SFTP server that is created.
    */
  var ServerId: typings.awsDashSdk.clientsTransferMod.ServerId
}

object CreateServerResponse {
  @scala.inline
  def apply(ServerId: ServerId): CreateServerResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId)
  
    __obj.asInstanceOf[CreateServerResponse]
  }
}

