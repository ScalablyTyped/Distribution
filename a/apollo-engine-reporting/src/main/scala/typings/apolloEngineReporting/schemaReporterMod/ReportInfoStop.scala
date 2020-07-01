package typings.apolloEngineReporting.schemaReporterMod

import typings.apolloEngineReporting.apolloEngineReportingBooleans.`true`
import typings.apolloEngineReporting.apolloEngineReportingStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportInfoStop extends ReportInfoResult {
  var kind: stop
  var stopReporting: `true`
}

object ReportInfoStop {
  @scala.inline
  def apply(kind: stop, stopReporting: `true`): ReportInfoStop = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stopReporting = stopReporting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportInfoStop]
  }
}

