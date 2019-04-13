package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqsAction extends js.Object {
  /**
    * The URL of the Amazon SQS queue.
    */
  var queueUrl: QueueUrl
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn
  /**
    * Specifies whether to use Base64 encoding.
    */
  var useBase64: js.UndefOr[UseBase64] = js.undefined
}

object SqsAction {
  @scala.inline
  def apply(queueUrl: QueueUrl, roleArn: AwsArn, useBase64: js.UndefOr[UseBase64] = js.undefined): SqsAction = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl, roleArn = roleArn)
    if (!js.isUndefined(useBase64)) __obj.updateDynamic("useBase64")(useBase64)
    __obj.asInstanceOf[SqsAction]
  }
}

