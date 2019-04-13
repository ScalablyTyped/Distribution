package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDevEndpointRequest extends js.Object {
  /**
    * Name of the DevEndpoint for which to retrieve information.
    */
  var EndpointName: GenericString
}

object GetDevEndpointRequest {
  @scala.inline
  def apply(EndpointName: GenericString): GetDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName)
  
    __obj.asInstanceOf[GetDevEndpointRequest]
  }
}

