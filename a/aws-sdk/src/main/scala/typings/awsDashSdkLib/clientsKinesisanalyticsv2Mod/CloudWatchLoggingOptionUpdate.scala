package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLoggingOptionUpdate extends js.Object {
  /**
    * The ID of the CloudWatch logging option to update
    */
  var CloudWatchLoggingOptionId: Id
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
    */
  var LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.undefined
}

object CloudWatchLoggingOptionUpdate {
  @scala.inline
  def apply(CloudWatchLoggingOptionId: Id, LogStreamARNUpdate: LogStreamARN = null): CloudWatchLoggingOptionUpdate = {
    val __obj = js.Dynamic.literal(CloudWatchLoggingOptionId = CloudWatchLoggingOptionId)
    if (LogStreamARNUpdate != null) __obj.updateDynamic("LogStreamARNUpdate")(LogStreamARNUpdate)
    __obj.asInstanceOf[CloudWatchLoggingOptionUpdate]
  }
}

