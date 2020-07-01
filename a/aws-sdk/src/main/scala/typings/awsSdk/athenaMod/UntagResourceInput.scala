package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceInput extends js.Object {
  /**
    * Specifies the ARN of the resource from which tags are to be removed.
    */
  var ResourceARN: AmazonResourceName = js.native
  /**
    * A comma-separated list of one or more tag keys whose tags are to be removed from the specified resource.
    */
  var TagKeys: TagKeyList = js.native
}

object UntagResourceInput {
  @scala.inline
  def apply(ResourceARN: AmazonResourceName, TagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
}

