package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartMaintenanceRequest extends js.Object {
  /**
    * Engine attributes that are specific to the server on which you want to run maintenance. 
    */
  var EngineAttributes: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.EngineAttributes] = js.undefined
  /**
    * The name of the server on which to run maintenance. 
    */
  var ServerName: typings.awsDashSdk.clientsOpsworkscmMod.ServerName
}

object StartMaintenanceRequest {
  @scala.inline
  def apply(ServerName: ServerName, EngineAttributes: EngineAttributes = null): StartMaintenanceRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName)
    if (EngineAttributes != null) __obj.updateDynamic("EngineAttributes")(EngineAttributes)
    __obj.asInstanceOf[StartMaintenanceRequest]
  }
}

