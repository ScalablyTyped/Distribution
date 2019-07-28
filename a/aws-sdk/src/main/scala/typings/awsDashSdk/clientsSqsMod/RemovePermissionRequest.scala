package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovePermissionRequest extends js.Object {
  /**
    * The identification of the permission to remove. This is the label added using the  AddPermission  action.
    */
  var Label: String
  /**
    * The URL of the Amazon SQS queue from which permissions are removed. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
}

object RemovePermissionRequest {
  @scala.inline
  def apply(Label: String, QueueUrl: String): RemovePermissionRequest = {
    val __obj = js.Dynamic.literal(Label = Label, QueueUrl = QueueUrl)
  
    __obj.asInstanceOf[RemovePermissionRequest]
  }
}

