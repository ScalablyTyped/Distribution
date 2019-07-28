package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterInstanceRequest extends js.Object {
  /**
    * The value that you specified for Id in the RegisterInstance request.
    */
  var InstanceId: ResourceId
  /**
    * The ID of the service that the instance is associated with.
    */
  var ServiceId: ResourceId
}

object DeregisterInstanceRequest {
  @scala.inline
  def apply(InstanceId: ResourceId, ServiceId: ResourceId): DeregisterInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, ServiceId = ServiceId)
  
    __obj.asInstanceOf[DeregisterInstanceRequest]
  }
}

