package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEndpointInput extends js.Object {
  /**
    * The name of the endpoint that you want to delete.
    */
  var EndpointName: awsDashSdkLib.clientsSagemakerMod.EndpointName
}

object DeleteEndpointInput {
  @scala.inline
  def apply(EndpointName: EndpointName): DeleteEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName)
  
    __obj.asInstanceOf[DeleteEndpointInput]
  }
}

