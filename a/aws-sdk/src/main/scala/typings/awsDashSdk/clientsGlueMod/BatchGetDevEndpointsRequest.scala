package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDevEndpointsRequest extends js.Object {
  /**
    * The list of DevEndpoint names, which might be the names returned from the ListDevEndpoint operation.
    */
  var DevEndpointNames: typings.awsDashSdk.clientsGlueMod.DevEndpointNames = js.native
}

object BatchGetDevEndpointsRequest {
  @scala.inline
  def apply(DevEndpointNames: DevEndpointNames): BatchGetDevEndpointsRequest = {
    val __obj = js.Dynamic.literal(DevEndpointNames = DevEndpointNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetDevEndpointsRequest]
  }
}

