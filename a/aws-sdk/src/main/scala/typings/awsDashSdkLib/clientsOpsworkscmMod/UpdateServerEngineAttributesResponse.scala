package typings
package awsDashSdkLib.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServerEngineAttributesResponse extends js.Object {
  /**
    * Contains the response to an UpdateServerEngineAttributes request. 
    */
  var Server: js.UndefOr[Server] = js.undefined
}

object UpdateServerEngineAttributesResponse {
  @scala.inline
  def apply(Server: Server = null): UpdateServerEngineAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (Server != null) __obj.updateDynamic("Server")(Server)
    __obj.asInstanceOf[UpdateServerEngineAttributesResponse]
  }
}

