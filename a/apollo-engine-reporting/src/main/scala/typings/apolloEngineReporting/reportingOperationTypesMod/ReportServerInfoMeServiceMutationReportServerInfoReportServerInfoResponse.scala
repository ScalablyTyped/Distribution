package typings.apolloEngineReporting.reportingOperationTypesMod

import typings.apolloEngineReporting.apolloEngineReportingStrings.ReportServerInfoResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoResponse extends ReportServerInfoMeServiceMutationReportServerInfo {
  var __typename: ReportServerInfoResponse
  var inSeconds: Double
  var withExecutableSchema: Boolean
}

object ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoResponse {
  @scala.inline
  def apply(__typename: ReportServerInfoResponse, inSeconds: Double, withExecutableSchema: Boolean): ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoResponse = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], inSeconds = inSeconds.asInstanceOf[js.Any], withExecutableSchema = withExecutableSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoResponse]
  }
}

