package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchOutputConfig extends js.Object {
  /**
    * The name of the CloudWatch log group where you want to send command output. If you don't specify a group name, Systems Manager automatically creates a log group for you. The log group uses the following naming format: aws/ssm/SystemsManagerDocumentName.
    */
  var CloudWatchLogGroupName: js.UndefOr[CloudWatchLogGroupName] = js.undefined
  /**
    * Enables Systems Manager to send command output to CloudWatch Logs.
    */
  var CloudWatchOutputEnabled: js.UndefOr[CloudWatchOutputEnabled] = js.undefined
}

object CloudWatchOutputConfig {
  @scala.inline
  def apply(
    CloudWatchLogGroupName: CloudWatchLogGroupName = null,
    CloudWatchOutputEnabled: js.UndefOr[CloudWatchOutputEnabled] = js.undefined
  ): CloudWatchOutputConfig = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogGroupName != null) __obj.updateDynamic("CloudWatchLogGroupName")(CloudWatchLogGroupName)
    if (!js.isUndefined(CloudWatchOutputEnabled)) __obj.updateDynamic("CloudWatchOutputEnabled")(CloudWatchOutputEnabled)
    __obj.asInstanceOf[CloudWatchOutputConfig]
  }
}

