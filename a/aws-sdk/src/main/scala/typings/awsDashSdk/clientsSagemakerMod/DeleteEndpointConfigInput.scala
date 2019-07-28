package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEndpointConfigInput extends js.Object {
  /**
    * The name of the endpoint configuration that you want to delete.
    */
  var EndpointConfigName: typings.awsDashSdk.clientsSagemakerMod.EndpointConfigName
}

object DeleteEndpointConfigInput {
  @scala.inline
  def apply(EndpointConfigName: EndpointConfigName): DeleteEndpointConfigInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName)
  
    __obj.asInstanceOf[DeleteEndpointConfigInput]
  }
}

