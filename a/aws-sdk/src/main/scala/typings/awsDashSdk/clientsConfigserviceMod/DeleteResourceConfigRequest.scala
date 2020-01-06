package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourceConfigRequest extends js.Object {
  /**
    * Unique identifier of the resource.
    */
  var ResourceId: typings.awsDashSdk.clientsConfigserviceMod.ResourceId = js.native
  /**
    * The type of the resource.
    */
  var ResourceType: ResourceTypeString = js.native
}

object DeleteResourceConfigRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, ResourceType: ResourceTypeString): DeleteResourceConfigRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteResourceConfigRequest]
  }
}

