package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeMessageVisibilityBatchRequest extends js.Object {
  /**
    * A list of receipt handles of the messages for which the visibility timeout must be changed.
    */
  var Entries: ChangeMessageVisibilityBatchRequestEntryList
  /**
    * The URL of the Amazon SQS queue whose messages' visibility is changed. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
}

object ChangeMessageVisibilityBatchRequest {
  @scala.inline
  def apply(Entries: ChangeMessageVisibilityBatchRequestEntryList, QueueUrl: String): ChangeMessageVisibilityBatchRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries, QueueUrl = QueueUrl)
  
    __obj.asInstanceOf[ChangeMessageVisibilityBatchRequest]
  }
}

