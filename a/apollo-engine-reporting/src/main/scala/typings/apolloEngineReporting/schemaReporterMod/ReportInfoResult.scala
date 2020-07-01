package typings.apolloEngineReporting.schemaReporterMod

import typings.apolloEngineReporting.apolloEngineReportingBooleans.`true`
import typings.apolloEngineReporting.apolloEngineReportingStrings.next
import typings.apolloEngineReporting.apolloEngineReportingStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloEngineReporting.schemaReporterMod.ReportInfoStop
  - typings.apolloEngineReporting.schemaReporterMod.ReportInfoNext
*/
trait ReportInfoResult extends js.Object

object ReportInfoResult {
  @scala.inline
  def ReportInfoStop(kind: stop, stopReporting: `true`): ReportInfoResult = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stopReporting = stopReporting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportInfoResult]
  }
  @scala.inline
  def ReportInfoNext(inSeconds: Double, kind: next, withExecutableSchema: Boolean): ReportInfoResult = {
    val __obj = js.Dynamic.literal(inSeconds = inSeconds.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], withExecutableSchema = withExecutableSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportInfoResult]
  }
}

