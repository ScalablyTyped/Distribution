package typings.angularCore.timingStrategyMod

import typings.angularCore.queryDefinitionMod.QueryTiming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimingResult extends js.Object {
  var message: js.UndefOr[String] = js.native
  var timing: QueryTiming | Null = js.native
}

object TimingResult {
  @scala.inline
  def apply(): TimingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimingResult]
  }
  @scala.inline
  implicit class TimingResultOps[Self <: TimingResult] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setTiming(value: QueryTiming): Self = this.set("timing", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimingNull: Self = this.set("timing", null)
  }
  
}

