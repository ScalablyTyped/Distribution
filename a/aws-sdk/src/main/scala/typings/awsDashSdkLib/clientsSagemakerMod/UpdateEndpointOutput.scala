package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEndpointOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: awsDashSdkLib.clientsSagemakerMod.EndpointArn
}

object UpdateEndpointOutput {
  @scala.inline
  def apply(EndpointArn: EndpointArn): UpdateEndpointOutput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn)
  
    __obj.asInstanceOf[UpdateEndpointOutput]
  }
}

