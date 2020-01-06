package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOriginEndpointRequest extends js.Object {
  /**
    * The ID of the OriginEndpoint.
    */
  var Id: __string = js.native
}

object DescribeOriginEndpointRequest {
  @scala.inline
  def apply(Id: __string): DescribeOriginEndpointRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeOriginEndpointRequest]
  }
}

