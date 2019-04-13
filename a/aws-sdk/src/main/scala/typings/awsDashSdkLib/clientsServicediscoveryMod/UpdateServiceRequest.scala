package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServiceRequest extends js.Object {
  /**
    * The ID of the service that you want to update.
    */
  var Id: ResourceId
  /**
    * A complex type that contains the new settings for the service.
    */
  var Service: ServiceChange
}

object UpdateServiceRequest {
  @scala.inline
  def apply(Id: ResourceId, Service: ServiceChange): UpdateServiceRequest = {
    val __obj = js.Dynamic.literal(Id = Id, Service = Service)
  
    __obj.asInstanceOf[UpdateServiceRequest]
  }
}

