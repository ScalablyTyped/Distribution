package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqsAction extends js.Object {
  /**
    * The URL of the SQS queue where the data is written.
    */
  var queueUrl: QueueUrl
  /**
    * Set this to TRUE if you want the data to be Base-64 encoded before it is written to the queue. Otherwise, set this to FALSE.
    */
  var useBase64: js.UndefOr[UseBase64] = js.undefined
}

object SqsAction {
  @scala.inline
  def apply(queueUrl: QueueUrl, useBase64: js.UndefOr[UseBase64] = js.undefined): SqsAction = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl)
    if (!js.isUndefined(useBase64)) __obj.updateDynamic("useBase64")(useBase64)
    __obj.asInstanceOf[SqsAction]
  }
}

