package typings
package awsDashSdkLib.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueueUrlRequest extends js.Object {
  /**
    * The name of the queue whose URL must be fetched. Maximum 80 characters. Valid values: alphanumeric characters, hyphens (-), and underscores (_). Queue URLs and names are case-sensitive.
    */
  var QueueName: String
  /**
    * The AWS account ID of the account that created the queue.
    */
  var QueueOwnerAWSAccountId: js.UndefOr[String] = js.undefined
}

object GetQueueUrlRequest {
  @scala.inline
  def apply(QueueName: String, QueueOwnerAWSAccountId: String = null): GetQueueUrlRequest = {
    val __obj = js.Dynamic.literal(QueueName = QueueName)
    if (QueueOwnerAWSAccountId != null) __obj.updateDynamic("QueueOwnerAWSAccountId")(QueueOwnerAWSAccountId)
    __obj.asInstanceOf[GetQueueUrlRequest]
  }
}

