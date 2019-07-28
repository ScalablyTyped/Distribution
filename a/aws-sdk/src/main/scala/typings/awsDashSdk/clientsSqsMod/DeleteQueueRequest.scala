package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteQueueRequest extends js.Object {
  /**
    * The URL of the Amazon SQS queue to delete. Queue URLs and names are case-sensitive.
    */
  var QueueUrl: String
}

object DeleteQueueRequest {
  @scala.inline
  def apply(QueueUrl: String): DeleteQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl)
  
    __obj.asInstanceOf[DeleteQueueRequest]
  }
}

