package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLoggingOption extends js.Object {
  /**
    * The ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: awsDashSdkLib.clientsKinesisanalyticsv2Mod.LogStreamARN
}

object CloudWatchLoggingOption {
  @scala.inline
  def apply(LogStreamARN: LogStreamARN): CloudWatchLoggingOption = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN)
  
    __obj.asInstanceOf[CloudWatchLoggingOption]
  }
}

