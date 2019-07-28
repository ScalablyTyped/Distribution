package typings.awsDashSdk.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourcesInput extends js.Object {
  /**
    * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a resource. You can specify a minimum of 1 and a maximum of 20 ARNs (resources) to untag. An ARN can be set to a maximum of 1600 characters. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var ResourceARNList: typings.awsDashSdk.clientsResourcegroupstaggingapiMod.ResourceARNList
  /**
    * A list of the tag keys that you want to remove from the specified resources.
    */
  var TagKeys: TagKeyListForUntag
}

object UntagResourcesInput {
  @scala.inline
  def apply(ResourceARNList: ResourceARNList, TagKeys: TagKeyListForUntag): UntagResourcesInput = {
    val __obj = js.Dynamic.literal(ResourceARNList = ResourceARNList, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourcesInput]
  }
}

