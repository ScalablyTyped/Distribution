package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsOutput extends js.Object {
  /**
    * The ID of the ML object that was tagged.
    */
  var ResourceId: js.UndefOr[EntityId] = js.native
  /**
    * The type of the ML object that was tagged.
    */
  var ResourceType: js.UndefOr[TaggableResourceType] = js.native
}

object AddTagsOutput {
  @scala.inline
  def apply(ResourceId: EntityId = null, ResourceType: TaggableResourceType = null): AddTagsOutput = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsOutput]
  }
}

