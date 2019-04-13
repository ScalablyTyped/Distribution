package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsInput extends js.Object {
  /**
    * The ID of the ML object to tag. For example, exampleModelId.
    */
  var ResourceId: EntityId
  /**
    * The type of the ML object to tag. 
    */
  var ResourceType: TaggableResourceType
  /**
    * The key-value pairs to use to create tags. If you specify a key without specifying a value, Amazon ML creates a tag with the specified key and a value of null.
    */
  var Tags: TagList
}

object AddTagsInput {
  @scala.inline
  def apply(ResourceId: EntityId, ResourceType: TaggableResourceType, Tags: TagList): AddTagsInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, ResourceType = ResourceType.asInstanceOf[js.Any], Tags = Tags)
  
    __obj.asInstanceOf[AddTagsInput]
  }
}

