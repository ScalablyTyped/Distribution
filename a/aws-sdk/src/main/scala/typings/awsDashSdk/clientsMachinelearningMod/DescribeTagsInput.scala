package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTagsInput extends js.Object {
  /**
    * The ID of the ML object. For example, exampleModelId. 
    */
  var ResourceId: EntityId
  /**
    * The type of the ML object.
    */
  var ResourceType: TaggableResourceType
}

object DescribeTagsInput {
  @scala.inline
  def apply(ResourceId: EntityId, ResourceType: TaggableResourceType): DescribeTagsInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, ResourceType = ResourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeTagsInput]
  }
}

