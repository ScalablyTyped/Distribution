package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceRequest extends js.Object {
  /**
    * The ID of the service that you want to get settings for.
    */
  var Id: ResourceId
}

object GetServiceRequest {
  @scala.inline
  def apply(Id: ResourceId): GetServiceRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetServiceRequest]
  }
}

