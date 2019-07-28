package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDevEndpointRequest extends js.Object {
  /**
    * The name of the DevEndpoint.
    */
  var EndpointName: GenericString
}

object DeleteDevEndpointRequest {
  @scala.inline
  def apply(EndpointName: GenericString): DeleteDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName)
  
    __obj.asInstanceOf[DeleteDevEndpointRequest]
  }
}

