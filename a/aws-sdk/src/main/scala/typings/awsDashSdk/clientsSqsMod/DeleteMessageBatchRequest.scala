package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMessageBatchRequest extends js.Object {
  /**
    * A list of receipt handles for the messages to be deleted.
    */
  var Entries: DeleteMessageBatchRequestEntryList
  /**
    * The URL of the Amazon SQS queue from which messages are deleted. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
}

object DeleteMessageBatchRequest {
  @scala.inline
  def apply(Entries: DeleteMessageBatchRequestEntryList, QueueUrl: String): DeleteMessageBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries, QueueUrl = QueueUrl)
  
    __obj.asInstanceOf[DeleteMessageBatchRequest]
  }
}

