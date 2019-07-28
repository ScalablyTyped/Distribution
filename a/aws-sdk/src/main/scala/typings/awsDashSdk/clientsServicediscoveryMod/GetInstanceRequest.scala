package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceRequest extends js.Object {
  /**
    * The ID of the instance that you want to get information about.
    */
  var InstanceId: ResourceId
  /**
    * The ID of the service that the instance is associated with.
    */
  var ServiceId: ResourceId
}

object GetInstanceRequest {
  @scala.inline
  def apply(InstanceId: ResourceId, ServiceId: ResourceId): GetInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, ServiceId = ServiceId)
  
    __obj.asInstanceOf[GetInstanceRequest]
  }
}

