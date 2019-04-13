package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagSpecification extends js.Object {
  /**
    * The type of resource to tag. Currently, the resource types that support tagging on creation are fleet, dedicated-host, instance, snapshot, and volume. To tag a resource after it has been created, see CreateTags.
    */
  var ResourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The tags to apply to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object TagSpecification {
  @scala.inline
  def apply(ResourceType: ResourceType = null, Tags: TagList = null): TagSpecification = {
    val __obj = js.Dynamic.literal()
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[TagSpecification]
  }
}

