package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueueUrlRequest extends js.Object {
  /**
    * The name of the queue whose URL must be fetched. Maximum 80 characters. Valid values: alphanumeric characters, hyphens (-), and underscores (_). Queue URLs and names are case-sensitive.
    */
  var QueueName: String = js.native
  /**
    * The AWS account ID of the account that created the queue.
    */
  var QueueOwnerAWSAccountId: js.UndefOr[String] = js.native
}

object GetQueueUrlRequest {
  @scala.inline
  def apply(QueueName: String, QueueOwnerAWSAccountId: String = null): GetQueueUrlRequest = {
    val __obj = js.Dynamic.literal(QueueName = QueueName.asInstanceOf[js.Any])
    if (QueueOwnerAWSAccountId != null) __obj.updateDynamic("QueueOwnerAWSAccountId")(QueueOwnerAWSAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueueUrlRequest]
  }
}

