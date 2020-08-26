package typings.apolloEngineReporting.schemaReporterMod

import typings.apolloEngineReporting.apolloEngineReportingBooleans.`true`
import typings.apolloEngineReporting.apolloEngineReportingStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportInfoStop extends ReportInfoResult {
  var kind: stop = js.native
  var stopReporting: `true` = js.native
}

object ReportInfoStop {
  @scala.inline
  def apply(kind: stop, stopReporting: `true`): ReportInfoStop = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stopReporting = stopReporting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportInfoStop]
  }
  @scala.inline
  implicit class ReportInfoStopOps[Self <: ReportInfoStop] (val x: Self) extends AnyVal {
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
    def setKind(value: stop): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopReporting(value: `true`): Self = this.set("stopReporting", value.asInstanceOf[js.Any])
  }
  
}

