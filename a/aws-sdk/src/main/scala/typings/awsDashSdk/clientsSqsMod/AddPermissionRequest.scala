package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddPermissionRequest extends js.Object {
  /**
    * The AWS account number of the principal who is given permission. The principal must have an AWS account, but does not need to be signed up for Amazon SQS. For information about locating the AWS account identification, see Your AWS Identifiers in the Amazon Simple Queue Service Developer Guide.
    */
  var AWSAccountIds: AWSAccountIdList = js.native
  /**
    * The action the client wants to allow for the specified principal. Valid values: the name of any action or *. For more information about these actions, see Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource in the Amazon Simple Queue Service Developer Guide. Specifying SendMessage, DeleteMessage, or ChangeMessageVisibility for ActionName.n also grants permissions for the corresponding batch versions of those actions: SendMessageBatch, DeleteMessageBatch, and ChangeMessageVisibilityBatch.
    */
  var Actions: ActionNameList = js.native
  /**
    * The unique identification of the permission you're setting (for example, AliceSendMessage). Maximum 80 characters. Allowed characters include alphanumeric characters, hyphens (-), and underscores (_).
    */
  var Label: String = js.native
  /**
    * The URL of the Amazon SQS queue to which permissions are added. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
}

object AddPermissionRequest {
  @scala.inline
  def apply(AWSAccountIds: AWSAccountIdList, Actions: ActionNameList, Label: String, QueueUrl: String): AddPermissionRequest = {
    val __obj = js.Dynamic.literal(AWSAccountIds = AWSAccountIds.asInstanceOf[js.Any], Actions = Actions.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddPermissionRequest]
  }
}

