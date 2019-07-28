package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartMaintenanceResponse extends js.Object {
  /**
    * Contains the response to a StartMaintenance request. 
    */
  var Server: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.Server] = js.undefined
}

object StartMaintenanceResponse {
  @scala.inline
  def apply(Server: Server = null): StartMaintenanceResponse = {
    val __obj = js.Dynamic.literal()
    if (Server != null) __obj.updateDynamic("Server")(Server)
    __obj.asInstanceOf[StartMaintenanceResponse]
  }
}

