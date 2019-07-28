package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessageBatchRequest extends js.Object {
  /**
    * A list of  SendMessageBatchRequestEntry  items.
    */
  var Entries: SendMessageBatchRequestEntryList
  /**
    * The URL of the Amazon SQS queue to which batched messages are sent. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
}

object SendMessageBatchRequest {
  @scala.inline
  def apply(Entries: SendMessageBatchRequestEntryList, QueueUrl: String): SendMessageBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries, QueueUrl = QueueUrl)
  
    __obj.asInstanceOf[SendMessageBatchRequest]
  }
}

