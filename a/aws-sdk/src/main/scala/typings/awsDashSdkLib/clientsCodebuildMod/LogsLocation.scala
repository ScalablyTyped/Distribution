package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogsLocation extends js.Object {
  /**
    *  Information about Amazon CloudWatch Logs for a build project. 
    */
  var cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig] = js.undefined
  /**
    * The URL to an individual build log in Amazon CloudWatch Logs.
    */
  var deepLink: js.UndefOr[String] = js.undefined
  /**
    * The name of the Amazon CloudWatch Logs group for the build logs.
    */
  var groupName: js.UndefOr[String] = js.undefined
  /**
    *  The URL to a build log in an S3 bucket. 
    */
  var s3DeepLink: js.UndefOr[String] = js.undefined
  /**
    *  Information about S3 logs for a build project. 
    */
  var s3Logs: js.UndefOr[S3LogsConfig] = js.undefined
  /**
    * The name of the Amazon CloudWatch Logs stream for the build logs.
    */
  var streamName: js.UndefOr[String] = js.undefined
}

object LogsLocation {
  @scala.inline
  def apply(
    cloudWatchLogs: CloudWatchLogsConfig = null,
    deepLink: String = null,
    groupName: String = null,
    s3DeepLink: String = null,
    s3Logs: S3LogsConfig = null,
    streamName: String = null
  ): LogsLocation = {
    val __obj = js.Dynamic.literal()
    if (cloudWatchLogs != null) __obj.updateDynamic("cloudWatchLogs")(cloudWatchLogs)
    if (deepLink != null) __obj.updateDynamic("deepLink")(deepLink)
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    if (s3DeepLink != null) __obj.updateDynamic("s3DeepLink")(s3DeepLink)
    if (s3Logs != null) __obj.updateDynamic("s3Logs")(s3Logs)
    if (streamName != null) __obj.updateDynamic("streamName")(streamName)
    __obj.asInstanceOf[LogsLocation]
  }
}

