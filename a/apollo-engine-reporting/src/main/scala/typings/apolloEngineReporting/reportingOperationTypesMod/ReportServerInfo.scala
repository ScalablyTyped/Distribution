package typings.apolloEngineReporting.reportingOperationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportServerInfo extends js.Object {
  var me: ReportServerInfoMe | Null
}

object ReportServerInfo {
  @scala.inline
  def apply(me: ReportServerInfoMe = null): ReportServerInfo = {
    val __obj = js.Dynamic.literal(me = me.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfo]
  }
}

