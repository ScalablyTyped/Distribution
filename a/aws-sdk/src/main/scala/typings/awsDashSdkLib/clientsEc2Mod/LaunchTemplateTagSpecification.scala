package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateTagSpecification extends js.Object {
  /**
    * The type of resource.
    */
  var ResourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The tags for the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object LaunchTemplateTagSpecification {
  @scala.inline
  def apply(ResourceType: ResourceType = null, Tags: TagList = null): LaunchTemplateTagSpecification = {
    val __obj = js.Dynamic.literal()
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[LaunchTemplateTagSpecification]
  }
}

