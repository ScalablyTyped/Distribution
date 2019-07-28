package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEndpointConfigOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the endpoint configuration. 
    */
  var EndpointConfigArn: typings.awsDashSdk.clientsSagemakerMod.EndpointConfigArn
}

object CreateEndpointConfigOutput {
  @scala.inline
  def apply(EndpointConfigArn: EndpointConfigArn): CreateEndpointConfigOutput = {
    val __obj = js.Dynamic.literal(EndpointConfigArn = EndpointConfigArn)
  
    __obj.asInstanceOf[CreateEndpointConfigOutput]
  }
}

