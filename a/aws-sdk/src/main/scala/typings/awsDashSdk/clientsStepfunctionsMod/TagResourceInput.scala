package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the Step Functions state machine or activity.
    */
  var resourceArn: Arn
  /**
    * The list of tags to add to a resource. Tags may only contain unicode letters, digits, whitespace, or these symbols: _ . : / = + - @.
    */
  var tags: TagList
}

object TagResourceInput {
  @scala.inline
  def apply(resourceArn: Arn, tags: TagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, tags = tags)
  
    __obj.asInstanceOf[TagResourceInput]
  }
}

