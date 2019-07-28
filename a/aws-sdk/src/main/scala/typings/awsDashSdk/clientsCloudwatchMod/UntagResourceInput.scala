package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceInput extends js.Object {
  /**
    * The ARN of the CloudWatch resource that you're removing tags from. For more information on ARN format, see Example ARNs in the Amazon Web Services General Reference.
    */
  var ResourceARN: AmazonResourceName
  /**
    * The list of tag keys to remove from the resource.
    */
  var TagKeys: TagKeyList
}

object UntagResourceInput {
  @scala.inline
  def apply(ResourceARN: AmazonResourceName, TagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

