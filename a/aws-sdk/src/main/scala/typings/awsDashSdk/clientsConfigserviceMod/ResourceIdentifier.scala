package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIdentifier extends js.Object {
  /**
    * The time that the resource was deleted.
    */
  var resourceDeletionTime: js.UndefOr[ResourceDeletionTime] = js.native
  /**
    * The ID of the resource (for example, sg-xxxxxx).
    */
  var resourceId: js.UndefOr[ResourceId] = js.native
  /**
    * The custom name of the resource (if available).
    */
  var resourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The type of resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}

object ResourceIdentifier {
  @scala.inline
  def apply(
    resourceDeletionTime: ResourceDeletionTime = null,
    resourceId: ResourceId = null,
    resourceName: ResourceName = null,
    resourceType: ResourceType = null
  ): ResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    if (resourceDeletionTime != null) __obj.updateDynamic("resourceDeletionTime")(resourceDeletionTime.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdentifier]
  }
}

