package typings.apolloEngineReporting.schemaReporterMod

import typings.apolloEngineReporting.apolloEngineReportingStrings.next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportInfoNext extends ReportInfoResult {
  var inSeconds: Double
  var kind: next
  var withExecutableSchema: Boolean
}

object ReportInfoNext {
  @scala.inline
  def apply(inSeconds: Double, kind: next, withExecutableSchema: Boolean): ReportInfoNext = {
    val __obj = js.Dynamic.literal(inSeconds = inSeconds.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], withExecutableSchema = withExecutableSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportInfoNext]
  }
}

