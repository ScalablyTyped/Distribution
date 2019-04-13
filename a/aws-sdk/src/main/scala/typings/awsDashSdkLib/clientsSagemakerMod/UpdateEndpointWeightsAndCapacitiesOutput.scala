package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEndpointWeightsAndCapacitiesOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the updated endpoint.
    */
  var EndpointArn: awsDashSdkLib.clientsSagemakerMod.EndpointArn
}

object UpdateEndpointWeightsAndCapacitiesOutput {
  @scala.inline
  def apply(EndpointArn: EndpointArn): UpdateEndpointWeightsAndCapacitiesOutput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn)
  
    __obj.asInstanceOf[UpdateEndpointWeightsAndCapacitiesOutput]
  }
}

