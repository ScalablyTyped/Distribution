package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportServerEngineAttributeResponse extends js.Object {
  /**
    * The requested engine attribute pair with attribute name and value.
    */
  var EngineAttribute: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.EngineAttribute] = js.undefined
  /**
    * The server name used in the request.
    */
  var ServerName: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.ServerName] = js.undefined
}

object ExportServerEngineAttributeResponse {
  @scala.inline
  def apply(EngineAttribute: EngineAttribute = null, ServerName: ServerName = null): ExportServerEngineAttributeResponse = {
    val __obj = js.Dynamic.literal()
    if (EngineAttribute != null) __obj.updateDynamic("EngineAttribute")(EngineAttribute)
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName)
    __obj.asInstanceOf[ExportServerEngineAttributeResponse]
  }
}

