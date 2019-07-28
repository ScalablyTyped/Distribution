package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceKey extends js.Object {
  /**
    * The ID of the resource (for example., sg-xxxxxx). 
    */
  var resourceId: ResourceId
  /**
    * The resource type.
    */
  var resourceType: ResourceType
}

object ResourceKey {
  @scala.inline
  def apply(resourceId: ResourceId, resourceType: ResourceType): ResourceKey = {
    val __obj = js.Dynamic.literal(resourceId = resourceId, resourceType = resourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceKey]
  }
}

