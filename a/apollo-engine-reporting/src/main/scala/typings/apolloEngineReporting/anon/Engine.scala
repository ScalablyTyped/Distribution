package typings.apolloEngineReporting.anon

import typings.apolloEngineReporting.agentMod.EngineReportingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Engine extends js.Object {
  var engine: js.UndefOr[EngineReportingOptions[_] | Boolean] = js.native
  var logger: js.UndefOr[typings.apolloServerTypes.mod.Logger] = js.native
  var skipWarn: js.UndefOr[Boolean] = js.native
}

object Engine {
  @scala.inline
  def apply(): Engine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Engine]
  }
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
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
    def setEngine(value: EngineReportingOptions[_] | Boolean): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    @scala.inline
    def setLogger(value: typings.apolloServerTypes.mod.Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setSkipWarn(value: Boolean): Self = this.set("skipWarn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipWarn: Self = this.set("skipWarn", js.undefined)
  }
  
}

