package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingOptions extends js.Object {
  /**
    * If true, logging is enabled for AWS IoT Analytics.
    */
  var enabled: LoggingEnabled
  /**
    * The logging level. Currently, only "ERROR" is supported.
    */
  var level: LoggingLevel
  /**
    * The ARN of the role that grants permission to AWS IoT Analytics to perform logging.
    */
  var roleArn: RoleArn
}

object LoggingOptions {
  @scala.inline
  def apply(enabled: LoggingEnabled, level: LoggingLevel, roleArn: RoleArn): LoggingOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled, level = level.asInstanceOf[js.Any], roleArn = roleArn)
  
    __obj.asInstanceOf[LoggingOptions]
  }
}

