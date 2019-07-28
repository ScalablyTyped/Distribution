package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEndpointResponse extends js.Object {
  /**
    * The endpoint that was created.
    */
  var Endpoint: js.UndefOr[typings.awsDashSdk.clientsDmsMod.Endpoint] = js.undefined
}

object CreateEndpointResponse {
  @scala.inline
  def apply(Endpoint: Endpoint = null): CreateEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    __obj.asInstanceOf[CreateEndpointResponse]
  }
}

