package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The function's Amazon Resource Name (ARN).
    */
  var Resource: FunctionArn
  /**
    * A list of tag keys to remove from the function.
    */
  var TagKeys: TagKeyList
}

object UntagResourceRequest {
  @scala.inline
  def apply(Resource: FunctionArn, TagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

