package typings.artyomJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FatalityPromiseCallback extends js.Object {
  var fatalityPromiseCallback: js.UndefOr[js.Any] = js.native
  var lastSay: js.UndefOr[js.Any] = js.native
  var redirectRecognizedTextOutput: js.UndefOr[js.Any] = js.native
  var remoteProcessorHandler: js.UndefOr[js.Any] = js.native
}

object FatalityPromiseCallback {
  @scala.inline
  def apply(): FatalityPromiseCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FatalityPromiseCallback]
  }
  @scala.inline
  implicit class FatalityPromiseCallbackOps[Self <: FatalityPromiseCallback] (val x: Self) extends AnyVal {
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
    def setFatalityPromiseCallback(value: js.Any): Self = this.set("fatalityPromiseCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFatalityPromiseCallback: Self = this.set("fatalityPromiseCallback", js.undefined)
    @scala.inline
    def setLastSay(value: js.Any): Self = this.set("lastSay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSay: Self = this.set("lastSay", js.undefined)
    @scala.inline
    def setRedirectRecognizedTextOutput(value: js.Any): Self = this.set("redirectRecognizedTextOutput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectRecognizedTextOutput: Self = this.set("redirectRecognizedTextOutput", js.undefined)
    @scala.inline
    def setRemoteProcessorHandler(value: js.Any): Self = this.set("remoteProcessorHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteProcessorHandler: Self = this.set("remoteProcessorHandler", js.undefined)
  }
  
}

