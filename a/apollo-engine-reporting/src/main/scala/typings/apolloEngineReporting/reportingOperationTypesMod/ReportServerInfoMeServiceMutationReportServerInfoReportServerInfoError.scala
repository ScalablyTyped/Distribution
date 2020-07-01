package typings.apolloEngineReporting.reportingOperationTypesMod

import typings.apolloEngineReporting.apolloEngineReportingStrings.ReportServerInfoError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoError extends ReportServerInfoMeServiceMutationReportServerInfo {
  var __typename: ReportServerInfoError
  var code: ReportServerInfoErrorCode
  var message: String
}

object ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoError {
  @scala.inline
  def apply(__typename: ReportServerInfoError, code: ReportServerInfoErrorCode, message: String): ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoError = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoError]
  }
}

