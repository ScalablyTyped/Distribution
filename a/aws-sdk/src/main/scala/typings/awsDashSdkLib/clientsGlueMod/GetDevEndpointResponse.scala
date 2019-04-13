package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDevEndpointResponse extends js.Object {
  /**
    * A DevEndpoint definition.
    */
  var DevEndpoint: js.UndefOr[DevEndpoint] = js.undefined
}

object GetDevEndpointResponse {
  @scala.inline
  def apply(DevEndpoint: DevEndpoint = null): GetDevEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (DevEndpoint != null) __obj.updateDynamic("DevEndpoint")(DevEndpoint)
    __obj.asInstanceOf[GetDevEndpointResponse]
  }
}

