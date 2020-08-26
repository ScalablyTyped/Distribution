package typings.apolloEngineReporting.schemaReporterMod

import typings.apolloEngineReporting.apolloEngineReportingStrings.next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportInfoNext extends ReportInfoResult {
  var inSeconds: Double = js.native
  var kind: next = js.native
  var withExecutableSchema: Boolean = js.native
}

object ReportInfoNext {
  @scala.inline
  def apply(inSeconds: Double, kind: next, withExecutableSchema: Boolean): ReportInfoNext = {
    val __obj = js.Dynamic.literal(inSeconds = inSeconds.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], withExecutableSchema = withExecutableSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportInfoNext]
  }
  @scala.inline
  implicit class ReportInfoNextOps[Self <: ReportInfoNext] (val x: Self) extends AnyVal {
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
    def setInSeconds(value: Double): Self = this.set("inSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: next): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithExecutableSchema(value: Boolean): Self = this.set("withExecutableSchema", value.asInstanceOf[js.Any])
  }
  
}

