package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateAccessLogsResult extends js.Object {
  /**
    *  Pre-signed URL for the requested access logs. 
    */
  var logUrl: js.UndefOr[LogUrl] = js.native
}

object GenerateAccessLogsResult {
  @scala.inline
  def apply(logUrl: LogUrl = null): GenerateAccessLogsResult = {
    val __obj = js.Dynamic.literal()
    if (logUrl != null) __obj.updateDynamic("logUrl")(logUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateAccessLogsResult]
  }
}

