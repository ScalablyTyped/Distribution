package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEndpointOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: awsDashSdkLib.clientsSagemakerMod.EndpointArn
}

object CreateEndpointOutput {
  @scala.inline
  def apply(EndpointArn: EndpointArn): CreateEndpointOutput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn)
  
    __obj.asInstanceOf[CreateEndpointOutput]
  }
}

