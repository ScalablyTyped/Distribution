package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEndpointGroupRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the endpoint group to describe.
    */
  var EndpointGroupArn: GenericString
}

object DescribeEndpointGroupRequest {
  @scala.inline
  def apply(EndpointGroupArn: GenericString): DescribeEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupArn = EndpointGroupArn)
  
    __obj.asInstanceOf[DescribeEndpointGroupRequest]
  }
}

