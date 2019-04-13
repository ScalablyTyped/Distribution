package typings
package awsDashSdkLib.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServerResponse extends js.Object {
  /**
    * Contains the response to a UpdateServer request. 
    */
  var Server: js.UndefOr[Server] = js.undefined
}

object UpdateServerResponse {
  @scala.inline
  def apply(Server: Server = null): UpdateServerResponse = {
    val __obj = js.Dynamic.literal()
    if (Server != null) __obj.updateDynamic("Server")(Server)
    __obj.asInstanceOf[UpdateServerResponse]
  }
}

