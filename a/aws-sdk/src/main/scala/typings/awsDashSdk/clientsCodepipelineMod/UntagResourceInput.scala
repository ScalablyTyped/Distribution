package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceInput extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the resource to remove tags from.
    */
  var resourceArn: ResourceArn = js.native
  /**
    * The list of keys for the tags to be removed from the resource.
    */
  var tagKeys: TagKeyList = js.native
}

object UntagResourceInput {
  @scala.inline
  def apply(resourceArn: ResourceArn, tagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

