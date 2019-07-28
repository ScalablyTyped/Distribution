package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLogsConfig extends js.Object {
  /**
    *  The group name of the logs in Amazon CloudWatch Logs. For more information, see Working with Log Groups and Log Streams. 
    */
  var groupName: js.UndefOr[String] = js.undefined
  /**
    * The current status of the logs in Amazon CloudWatch Logs for a build project. Valid values are:    ENABLED: Amazon CloudWatch Logs are enabled for this build project.    DISABLED: Amazon CloudWatch Logs are not enabled for this build project.  
    */
  var status: LogsConfigStatusType
  /**
    *  The prefix of the stream name of the Amazon CloudWatch Logs. For more information, see Working with Log Groups and Log Streams. 
    */
  var streamName: js.UndefOr[String] = js.undefined
}

object CloudWatchLogsConfig {
  @scala.inline
  def apply(status: LogsConfigStatusType, groupName: String = null, streamName: String = null): CloudWatchLogsConfig = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    if (streamName != null) __obj.updateDynamic("streamName")(streamName)
    __obj.asInstanceOf[CloudWatchLogsConfig]
  }
}

