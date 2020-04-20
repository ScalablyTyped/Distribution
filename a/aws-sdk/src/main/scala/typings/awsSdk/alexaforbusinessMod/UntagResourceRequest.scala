package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The ARN of the resource from which to remove metadata tags. Required. 
    */
  var Arn: typings.awsSdk.alexaforbusinessMod.Arn = js.native
  /**
    * The tags to be removed from the specified resource. Do not provide system tags. Required. 
    */
  var TagKeys: TagKeyList = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(Arn: Arn, TagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

