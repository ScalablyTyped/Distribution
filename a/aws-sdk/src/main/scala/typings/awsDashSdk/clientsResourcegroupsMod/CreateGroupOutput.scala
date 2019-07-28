package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupOutput extends js.Object {
  /**
    * A full description of the resource group after it is created.
    */
  var Group: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.Group] = js.undefined
  /**
    * The resource query associated with the group.
    */
  var ResourceQuery: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.ResourceQuery] = js.undefined
  /**
    * The tags associated with the group.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.Tags] = js.undefined
}

object CreateGroupOutput {
  @scala.inline
  def apply(Group: Group = null, ResourceQuery: ResourceQuery = null, Tags: Tags = null): CreateGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group)
    if (ResourceQuery != null) __obj.updateDynamic("ResourceQuery")(ResourceQuery)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateGroupOutput]
  }
}

