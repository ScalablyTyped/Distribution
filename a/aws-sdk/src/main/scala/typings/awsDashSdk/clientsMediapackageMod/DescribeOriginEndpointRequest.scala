package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOriginEndpointRequest extends js.Object {
  /**
    * The ID of the OriginEndpoint.
    */
  var Id: __string
}

object DescribeOriginEndpointRequest {
  @scala.inline
  def apply(Id: __string): DescribeOriginEndpointRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DescribeOriginEndpointRequest]
  }
}

