package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetV2LoggingLevelRequest extends js.Object {
  /**
    * The log level.
    */
  var logLevel: LogLevel
  /**
    * The log target.
    */
  var logTarget: LogTarget
}

object SetV2LoggingLevelRequest {
  @scala.inline
  def apply(logLevel: LogLevel, logTarget: LogTarget): SetV2LoggingLevelRequest = {
    val __obj = js.Dynamic.literal(logLevel = logLevel.asInstanceOf[js.Any], logTarget = logTarget)
  
    __obj.asInstanceOf[SetV2LoggingLevelRequest]
  }
}

