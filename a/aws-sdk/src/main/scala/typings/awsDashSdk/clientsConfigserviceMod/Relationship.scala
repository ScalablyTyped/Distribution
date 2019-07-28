package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relationship extends js.Object {
  /**
    * The type of relationship with the related resource.
    */
  var relationshipName: js.UndefOr[RelationshipName] = js.undefined
  /**
    * The ID of the related resource (for example, sg-xxxxxx).
    */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  /**
    * The custom name of the related resource, if available.
    */
  var resourceName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The resource type of the related resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}

object Relationship {
  @scala.inline
  def apply(
    relationshipName: RelationshipName = null,
    resourceId: ResourceId = null,
    resourceName: ResourceName = null,
    resourceType: ResourceType = null
  ): Relationship = {
    val __obj = js.Dynamic.literal()
    if (relationshipName != null) __obj.updateDynamic("relationshipName")(relationshipName)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relationship]
  }
}

