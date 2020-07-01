package typings.apolloEngineReporting.reportingOperationTypesMod

import typings.apolloEngineReporting.apolloEngineReportingStrings.ServiceMutation
import typings.apolloEngineReporting.apolloEngineReportingStrings.UserMutation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.apolloEngineReporting.reportingOperationTypesMod.ReportServerInfoMeUserMutation
  - typings.apolloEngineReporting.reportingOperationTypesMod.ReportServerInfoMeServiceMutation
*/
trait ReportServerInfoMe extends js.Object

object ReportServerInfoMe {
  @scala.inline
  def ReportServerInfoMeUserMutation(__typename: UserMutation): ReportServerInfoMe = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoMe]
  }
  @scala.inline
  def ReportServerInfoMeServiceMutation(
    __typename: ServiceMutation,
    reportServerInfo: ReportServerInfoMeServiceMutationReportServerInfo = null
  ): ReportServerInfoMe = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], reportServerInfo = reportServerInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoMe]
  }
}

