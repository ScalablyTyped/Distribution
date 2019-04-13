package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLoggingOutput extends js.Object {
  var LoggingEnabled: js.UndefOr[LoggingEnabled] = js.undefined
}

object GetBucketLoggingOutput {
  @scala.inline
  def apply(LoggingEnabled: LoggingEnabled = null): GetBucketLoggingOutput = {
    val __obj = js.Dynamic.literal()
    if (LoggingEnabled != null) __obj.updateDynamic("LoggingEnabled")(LoggingEnabled)
    __obj.asInstanceOf[GetBucketLoggingOutput]
  }
}

