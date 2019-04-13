package typings
package awsDashSdkLib.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLogsDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an Amazon Identity and Access Management (IAM) role that is able to write event data to an Amazon CloudWatch destination.
    */
  var IamRoleArn: js.UndefOr[String] = js.undefined
  /**
    * The name of the Amazon CloudWatch Log Group that you want to record events in.
    */
  var LogGroupArn: js.UndefOr[String] = js.undefined
}

object CloudWatchLogsDestination {
  @scala.inline
  def apply(IamRoleArn: String = null, LogGroupArn: String = null): CloudWatchLogsDestination = {
    val __obj = js.Dynamic.literal()
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn)
    if (LogGroupArn != null) __obj.updateDynamic("LogGroupArn")(LogGroupArn)
    __obj.asInstanceOf[CloudWatchLogsDestination]
  }
}

