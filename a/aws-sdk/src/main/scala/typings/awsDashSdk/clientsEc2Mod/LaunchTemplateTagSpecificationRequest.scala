package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateTagSpecificationRequest extends js.Object {
  /**
    * The type of resource to tag. Currently, the resource types that support tagging on creation are instance and volume. To tag a resource after it has been created, see CreateTags.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ResourceType] = js.undefined
  /**
    * The tags to apply to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object LaunchTemplateTagSpecificationRequest {
  @scala.inline
  def apply(ResourceType: ResourceType = null, Tags: TagList = null): LaunchTemplateTagSpecificationRequest = {
    val __obj = js.Dynamic.literal()
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[LaunchTemplateTagSpecificationRequest]
  }
}

