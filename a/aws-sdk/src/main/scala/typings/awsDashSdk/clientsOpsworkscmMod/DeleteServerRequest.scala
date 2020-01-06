package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteServerRequest extends js.Object {
  /**
    * The ID of the server to delete.
    */
  var ServerName: typings.awsDashSdk.clientsOpsworkscmMod.ServerName = js.native
}

object DeleteServerRequest {
  @scala.inline
  def apply(ServerName: ServerName): DeleteServerRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteServerRequest]
  }
}

