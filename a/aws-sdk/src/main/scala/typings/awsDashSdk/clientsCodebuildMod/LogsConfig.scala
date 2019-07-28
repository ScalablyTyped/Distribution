package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogsConfig extends js.Object {
  /**
    *  Information about Amazon CloudWatch Logs for a build project. Amazon CloudWatch Logs are enabled by default. 
    */
  var cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig] = js.undefined
  /**
    *  Information about logs built to an S3 bucket for a build project. S3 logs are not enabled by default. 
    */
  var s3Logs: js.UndefOr[S3LogsConfig] = js.undefined
}

object LogsConfig {
  @scala.inline
  def apply(cloudWatchLogs: CloudWatchLogsConfig = null, s3Logs: S3LogsConfig = null): LogsConfig = {
    val __obj = js.Dynamic.literal()
    if (cloudWatchLogs != null) __obj.updateDynamic("cloudWatchLogs")(cloudWatchLogs)
    if (s3Logs != null) __obj.updateDynamic("s3Logs")(s3Logs)
    __obj.asInstanceOf[LogsConfig]
  }
}

