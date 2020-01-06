package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServerEngineAttributesResponse extends js.Object {
  /**
    * Contains the response to an UpdateServerEngineAttributes request. 
    */
  var Server: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.Server] = js.native
}

object UpdateServerEngineAttributesResponse {
  @scala.inline
  def apply(Server: Server = null): UpdateServerEngineAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Server != null) __obj.updateDynamic("Server")(Server.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerEngineAttributesResponse]
  }
}

