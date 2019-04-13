package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLoggingOptionDescription extends js.Object {
  /**
    * The ID of the CloudWatch logging option description.
    */
  var CloudWatchLoggingOptionId: js.UndefOr[Id] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: awsDashSdkLib.clientsKinesisanalyticsv2Mod.LogStreamARN
  /**
    * The IAM ARN of the role to use to send application messages.   Provided for backward compatibility. Applications created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var RoleARN: js.UndefOr[RoleARN] = js.undefined
}

object CloudWatchLoggingOptionDescription {
  @scala.inline
  def apply(LogStreamARN: LogStreamARN, CloudWatchLoggingOptionId: Id = null, RoleARN: RoleARN = null): CloudWatchLoggingOptionDescription = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN)
    if (CloudWatchLoggingOptionId != null) __obj.updateDynamic("CloudWatchLoggingOptionId")(CloudWatchLoggingOptionId)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    __obj.asInstanceOf[CloudWatchLoggingOptionDescription]
  }
}

