package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableIoTLoggingParams extends js.Object {
  /**
    * Specifies the types of information to be logged.
    */
  var logLevel: LogLevel
  /**
    * The ARN of the IAM role used for logging.
    */
  var roleArnForLogging: RoleArn
}

object EnableIoTLoggingParams {
  @scala.inline
  def apply(logLevel: LogLevel, roleArnForLogging: RoleArn): EnableIoTLoggingParams = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], roleArnForLogging = roleArnForLogging)
  
    __obj.asInstanceOf[EnableIoTLoggingParams]
  }
}

