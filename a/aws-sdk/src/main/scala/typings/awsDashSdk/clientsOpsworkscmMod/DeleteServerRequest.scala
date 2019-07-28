package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteServerRequest extends js.Object {
  /**
    * The ID of the server to delete.
    */
  var ServerName: typings.awsDashSdk.clientsOpsworkscmMod.ServerName
}

object DeleteServerRequest {
  @scala.inline
  def apply(ServerName: ServerName): DeleteServerRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName)
  
    __obj.asInstanceOf[DeleteServerRequest]
  }
}

