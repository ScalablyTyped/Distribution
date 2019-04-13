package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEndpointResponse extends js.Object {
  /**
    * The endpoint that was deleted.
    */
  var Endpoint: js.UndefOr[Endpoint] = js.undefined
}

object DeleteEndpointResponse {
  @scala.inline
  def apply(Endpoint: Endpoint = null): DeleteEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    __obj.asInstanceOf[DeleteEndpointResponse]
  }
}

