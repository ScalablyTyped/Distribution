package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovePermissionInput extends js.Object {
  /**
    * The unique label of the statement you want to remove.
    */
  var Label: label
  /**
    * The ARN of the topic whose access control policy you wish to modify.
    */
  var TopicArn: topicARN
}

object RemovePermissionInput {
  @scala.inline
  def apply(Label: label, TopicArn: topicARN): RemovePermissionInput = {
    val __obj = js.Dynamic.literal(Label = Label, TopicArn = TopicArn)
  
    __obj.asInstanceOf[RemovePermissionInput]
  }
}

