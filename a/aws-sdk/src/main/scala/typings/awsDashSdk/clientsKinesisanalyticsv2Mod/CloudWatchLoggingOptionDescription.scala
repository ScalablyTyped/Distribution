package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchLoggingOptionDescription extends js.Object {
  /**
    * The ID of the CloudWatch logging option description.
    */
  var CloudWatchLoggingOptionId: js.UndefOr[Id] = js.native
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.LogStreamARN = js.native
  /**
    * The IAM ARN of the role to use to send application messages.   Provided for backward compatibility. Applications created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var RoleARN: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.RoleARN] = js.native
}

object CloudWatchLoggingOptionDescription {
  @scala.inline
  def apply(LogStreamARN: LogStreamARN, CloudWatchLoggingOptionId: Id = null, RoleARN: RoleARN = null): CloudWatchLoggingOptionDescription = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN.asInstanceOf[js.Any])
    if (CloudWatchLoggingOptionId != null) __obj.updateDynamic("CloudWatchLoggingOptionId")(CloudWatchLoggingOptionId.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOptionDescription]
  }
}

