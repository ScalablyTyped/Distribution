package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTagsInput extends js.Object {
  /**
    * The ID of the tagged ML object. For example, exampleModelId.
    */
  var ResourceId: EntityId
  /**
    * The type of the tagged ML object.
    */
  var ResourceType: TaggableResourceType
  /**
    * One or more tags to delete.
    */
  var TagKeys: TagKeyList
}

object DeleteTagsInput {
  @scala.inline
  def apply(ResourceId: EntityId, ResourceType: TaggableResourceType, TagKeys: TagKeyList): DeleteTagsInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, ResourceType = ResourceType.asInstanceOf[js.Any], TagKeys = TagKeys)
  
    __obj.asInstanceOf[DeleteTagsInput]
  }
}

