package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the Step Functions state machine or activity.
    */
  var resourceArn: Arn
  /**
    * The list of tags to remove from the resource.
    */
  var tagKeys: TagKeyList
}

object UntagResourceInput {
  @scala.inline
  def apply(resourceArn: Arn, tagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tagKeys = tagKeys)
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

