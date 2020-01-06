package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMessageBatchRequest extends js.Object {
  /**
    * A list of receipt handles for the messages to be deleted.
    */
  var Entries: DeleteMessageBatchRequestEntryList = js.native
  /**
    * The URL of the Amazon SQS queue from which messages are deleted. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String = js.native
}

object DeleteMessageBatchRequest {
  @scala.inline
  def apply(Entries: DeleteMessageBatchRequestEntryList, QueueUrl: String): DeleteMessageBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMessageBatchRequest]
  }
}

