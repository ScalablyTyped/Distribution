package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteOriginEndpointRequest extends js.Object {
  /**
    * The ID of the OriginEndpoint to delete.
    */
  var Id: __string
}

object DeleteOriginEndpointRequest {
  @scala.inline
  def apply(Id: __string): DeleteOriginEndpointRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DeleteOriginEndpointRequest]
  }
}

