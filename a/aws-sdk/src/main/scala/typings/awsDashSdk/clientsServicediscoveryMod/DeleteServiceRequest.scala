package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteServiceRequest extends js.Object {
  /**
    * The ID of the service that you want to delete.
    */
  var Id: ResourceId
}

object DeleteServiceRequest {
  @scala.inline
  def apply(Id: ResourceId): DeleteServiceRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DeleteServiceRequest]
  }
}

