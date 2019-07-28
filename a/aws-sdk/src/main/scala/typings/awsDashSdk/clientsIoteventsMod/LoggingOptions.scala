package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingOptions extends js.Object {
  /**
    * Information that identifies those detector models and their detectors (instances) for which the logging level is given.
    */
  var detectorDebugOptions: js.UndefOr[DetectorDebugOptions] = js.undefined
  /**
    * If TRUE, logging is enabled for AWS IoT Events.
    */
  var enabled: LoggingEnabled
  /**
    * The logging level.
    */
  var level: LoggingLevel
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform logging.
    */
  var roleArn: AmazonResourceName
}

object LoggingOptions {
  @scala.inline
  def apply(
    enabled: LoggingEnabled,
    level: LoggingLevel,
    roleArn: AmazonResourceName,
    detectorDebugOptions: DetectorDebugOptions = null
  ): LoggingOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled, level = level.asInstanceOf[js.Any], roleArn = roleArn)
    if (detectorDebugOptions != null) __obj.updateDynamic("detectorDebugOptions")(detectorDebugOptions)
    __obj.asInstanceOf[LoggingOptions]
  }
}

