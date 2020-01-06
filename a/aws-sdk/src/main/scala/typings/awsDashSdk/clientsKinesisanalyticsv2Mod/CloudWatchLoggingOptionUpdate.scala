package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLoggingOptionUpdate extends js.Object {
  /**
    * The ID of the CloudWatch logging option to update
    */
  var CloudWatchLoggingOptionId: Id = js.native
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
    */
  var LogStreamARNUpdate: js.UndefOr[LogStreamARN] = js.native
}

object CloudWatchLoggingOptionUpdate {
  @scala.inline
  def apply(CloudWatchLoggingOptionId: Id, LogStreamARNUpdate: LogStreamARN = null): CloudWatchLoggingOptionUpdate = {
    val __obj = js.Dynamic.literal(CloudWatchLoggingOptionId = CloudWatchLoggingOptionId.asInstanceOf[js.Any])
    if (LogStreamARNUpdate != null) __obj.updateDynamic("LogStreamARNUpdate")(LogStreamARNUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOptionUpdate]
  }
}

