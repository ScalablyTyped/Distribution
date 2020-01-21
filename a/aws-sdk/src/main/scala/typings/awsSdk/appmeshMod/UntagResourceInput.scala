package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to delete tags from.
    */
  var resourceArn: Arn = js.native
  /**
    * The keys of the tags to be removed.
    */
  var tagKeys: TagKeyList = js.native
}

object UntagResourceInput {
  @scala.inline
  def apply(resourceArn: Arn, tagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

