package typings.apolloEngineReporting.reportingOperationTypesMod

import typings.apolloEngineReporting.apolloEngineReportingStrings.ServiceMutation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportServerInfoMeServiceMutation extends ReportServerInfoMe {
  var __typename: ServiceMutation
  var reportServerInfo: ReportServerInfoMeServiceMutationReportServerInfo | Null
}

object ReportServerInfoMeServiceMutation {
  @scala.inline
  def apply(
    __typename: ServiceMutation,
    reportServerInfo: ReportServerInfoMeServiceMutationReportServerInfo = null
  ): ReportServerInfoMeServiceMutation = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], reportServerInfo = reportServerInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoMeServiceMutation]
  }
}

