package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatsContext extends js.Object {
  /** StatsContext clientName */
  var clientName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** StatsContext clientReferenceId */
  var clientReferenceId: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** StatsContext clientVersion */
  var clientVersion: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object IStatsContext {
  @scala.inline
  def apply(
    clientName: java.lang.String = null,
    clientReferenceId: java.lang.String = null,
    clientVersion: java.lang.String = null
  ): IStatsContext = {
    val __obj = js.Dynamic.literal()
    if (clientName != null) __obj.updateDynamic("clientName")(clientName)
    if (clientReferenceId != null) __obj.updateDynamic("clientReferenceId")(clientReferenceId)
    if (clientVersion != null) __obj.updateDynamic("clientVersion")(clientVersion)
    __obj.asInstanceOf[IStatsContext]
  }
}

