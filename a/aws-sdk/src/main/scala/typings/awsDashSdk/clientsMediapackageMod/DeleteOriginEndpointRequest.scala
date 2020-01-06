package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOriginEndpointRequest extends js.Object {
  /**
    * The ID of the OriginEndpoint to delete.
    */
  var Id: __string = js.native
}

object DeleteOriginEndpointRequest {
  @scala.inline
  def apply(Id: __string): DeleteOriginEndpointRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteOriginEndpointRequest]
  }
}

