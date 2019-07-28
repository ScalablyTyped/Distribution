package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServerResponse extends js.Object {
  /**
    * Contains the response to a UpdateServer request. 
    */
  var Server: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.Server] = js.undefined
}

object UpdateServerResponse {
  @scala.inline
  def apply(Server: Server = null): UpdateServerResponse = {
    val __obj = js.Dynamic.literal()
    if (Server != null) __obj.updateDynamic("Server")(Server)
    __obj.asInstanceOf[UpdateServerResponse]
  }
}

