package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchOutputConfig extends js.Object {
  /**
    * The name of the CloudWatch log group where you want to send command output. If you don't specify a group name, Systems Manager automatically creates a log group for you. The log group uses the following naming format: aws/ssm/SystemsManagerDocumentName.
    */
  var CloudWatchLogGroupName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.CloudWatchLogGroupName] = js.native
  /**
    * Enables Systems Manager to send command output to CloudWatch Logs.
    */
  var CloudWatchOutputEnabled: js.UndefOr[typings.awsDashSdk.clientsSsmMod.CloudWatchOutputEnabled] = js.native
}

object CloudWatchOutputConfig {
  @scala.inline
  def apply(
    CloudWatchLogGroupName: CloudWatchLogGroupName = null,
    CloudWatchOutputEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): CloudWatchOutputConfig = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogGroupName != null) __obj.updateDynamic("CloudWatchLogGroupName")(CloudWatchLogGroupName.asInstanceOf[js.Any])
    if (!js.isUndefined(CloudWatchOutputEnabled)) __obj.updateDynamic("CloudWatchOutputEnabled")(CloudWatchOutputEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchOutputConfig]
  }
}

