package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetDevEndpointsRequest extends js.Object {
  /**
    * The list of DevEndpoint names, which might be the names returned from the ListDevEndpoint operation.
    */
  var DevEndpointNames: awsDashSdkLib.clientsGlueMod.DevEndpointNames
}

object BatchGetDevEndpointsRequest {
  @scala.inline
  def apply(DevEndpointNames: DevEndpointNames): BatchGetDevEndpointsRequest = {
    val __obj = js.Dynamic.literal(DevEndpointNames = DevEndpointNames)
  
    __obj.asInstanceOf[BatchGetDevEndpointsRequest]
  }
}

