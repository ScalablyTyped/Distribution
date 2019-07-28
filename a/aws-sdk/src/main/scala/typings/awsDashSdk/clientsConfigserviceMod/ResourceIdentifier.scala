package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceIdentifier extends js.Object {
  /**
    * The time that the resource was deleted.
    */
  var resourceDeletionTime: js.UndefOr[ResourceDeletionTime] = js.undefined
  /**
    * The ID of the resource (for example, sg-xxxxxx).
    */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  /**
    * The custom name of the resource (if available).
    */
  var resourceName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The type of resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
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
    if (resourceDeletionTime != null) __obj.updateDynamic("resourceDeletionTime")(resourceDeletionTime)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdentifier]
  }
}

