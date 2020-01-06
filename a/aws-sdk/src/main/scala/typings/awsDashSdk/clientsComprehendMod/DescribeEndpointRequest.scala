package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointRequest extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of the endpoint being described.
    */
  var EndpointArn: ComprehendEndpointArn = js.native
}

object DescribeEndpointRequest {
  @scala.inline
  def apply(EndpointArn: ComprehendEndpointArn): DescribeEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeEndpointRequest]
  }
}

