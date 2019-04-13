package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyEndpointResponse extends js.Object {
  /**
    * The modified endpoint.
    */
  var Endpoint: js.UndefOr[Endpoint] = js.undefined
}

object ModifyEndpointResponse {
  @scala.inline
  def apply(Endpoint: Endpoint = null): ModifyEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    __obj.asInstanceOf[ModifyEndpointResponse]
  }
}

