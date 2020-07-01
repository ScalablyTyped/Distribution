package typings.apolloEngineReporting.reportingOperationTypesMod

import typings.apolloEngineReporting.apolloEngineReportingStrings.UserMutation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportServerInfoMeUserMutation extends ReportServerInfoMe {
  var __typename: UserMutation
}

object ReportServerInfoMeUserMutation {
  @scala.inline
  def apply(__typename: UserMutation): ReportServerInfoMeUserMutation = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoMeUserMutation]
  }
}

