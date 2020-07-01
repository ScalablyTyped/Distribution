package typings.apolloEngineReporting.reportingOperationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportServerInfoVariables extends js.Object {
  var executableSchema: js.UndefOr[String | Null] = js.undefined
  var info: EdgeServerInfo
}

object ReportServerInfoVariables {
  @scala.inline
  def apply(info: EdgeServerInfo, executableSchema: js.UndefOr[Null | String] = js.undefined): ReportServerInfoVariables = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    if (!js.isUndefined(executableSchema)) __obj.updateDynamic("executableSchema")(executableSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoVariables]
  }
}

