package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatsContext extends js.Object {
  /** StatsContext clientName */
  var clientName: js.UndefOr[String | Null] = js.undefined
  /** StatsContext clientReferenceId */
  var clientReferenceId: js.UndefOr[String | Null] = js.undefined
  /** StatsContext clientVersion */
  var clientVersion: js.UndefOr[String | Null] = js.undefined
}

object IStatsContext {
  @scala.inline
  def apply(clientName: String = null, clientReferenceId: String = null, clientVersion: String = null): IStatsContext = {
    val __obj = js.Dynamic.literal()
    if (clientName != null) __obj.updateDynamic("clientName")(clientName)
    if (clientReferenceId != null) __obj.updateDynamic("clientReferenceId")(clientReferenceId)
    if (clientVersion != null) __obj.updateDynamic("clientVersion")(clientVersion)
    __obj.asInstanceOf[IStatsContext]
  }
}

