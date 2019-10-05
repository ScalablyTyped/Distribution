package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceInput extends js.Object {
  /**
    * The DynamoDB resource that the tags will be removed from. This value is an Amazon Resource Name (ARN).
    */
  var ResourceArn: ResourceArnString
  /**
    * A list of tag keys. Existing tags of the resource whose keys are members of this list will be removed from the DynamoDB resource.
    */
  var TagKeys: TagKeyList
}

object UntagResourceInput {
  @scala.inline
  def apply(ResourceArn: ResourceArnString, TagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

