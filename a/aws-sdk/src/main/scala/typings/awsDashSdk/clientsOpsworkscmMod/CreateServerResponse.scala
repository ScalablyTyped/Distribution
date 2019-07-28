package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServerResponse extends js.Object {
  /**
    * The server that is created by the request. 
    */
  var Server: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.Server] = js.undefined
}

object CreateServerResponse {
  @scala.inline
  def apply(Server: Server = null): CreateServerResponse = {
    val __obj = js.Dynamic.literal()
    if (Server != null) __obj.updateDynamic("Server")(Server)
    __obj.asInstanceOf[CreateServerResponse]
  }
}

