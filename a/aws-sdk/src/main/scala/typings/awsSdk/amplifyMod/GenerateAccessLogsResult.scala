package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateAccessLogsResult extends js.Object {
  /**
    *  The pre-signed URL for the requested access logs. 
    */
  var logUrl: js.UndefOr[LogUrl] = js.native
}

object GenerateAccessLogsResult {
  @scala.inline
  def apply(): GenerateAccessLogsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateAccessLogsResult]
  }
  @scala.inline
  implicit class GenerateAccessLogsResultOps[Self <: GenerateAccessLogsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLogUrl(value: LogUrl): Self = this.set("logUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogUrl: Self = this.set("logUrl", js.undefined)
  }
  
}

