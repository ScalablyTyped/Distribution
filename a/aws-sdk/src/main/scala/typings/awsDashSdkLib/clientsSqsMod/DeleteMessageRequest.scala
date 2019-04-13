package typings
package awsDashSdkLib.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMessageRequest extends js.Object {
  /**
    * The URL of the Amazon SQS queue from which messages are deleted. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
  /**
    * The receipt handle associated with the message to delete.
    */
  var ReceiptHandle: String
}

object DeleteMessageRequest {
  @scala.inline
  def apply(QueueUrl: String, ReceiptHandle: String): DeleteMessageRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl, ReceiptHandle = ReceiptHandle)
  
    __obj.asInstanceOf[DeleteMessageRequest]
  }
}

