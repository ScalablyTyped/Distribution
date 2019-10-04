package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateAccessLogsResult extends js.Object {
  /**
    *  Pre-signed URL for the requested access logs. 
    */
  var logUrl: js.UndefOr[LogUrl] = js.undefined
}

object GenerateAccessLogsResult {
  @scala.inline
  def apply(logUrl: LogUrl = null): GenerateAccessLogsResult = {
    val __obj = js.Dynamic.literal()
    if (logUrl != null) __obj.updateDynamic("logUrl")(logUrl)
    __obj.asInstanceOf[GenerateAccessLogsResult]
  }
}

