package typings
package apolloDashEngineDashReportingLib.distAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientInfo extends js.Object {
  var clientName: js.UndefOr[java.lang.String] = js.undefined
  var clientReferenceId: js.UndefOr[java.lang.String] = js.undefined
  var clientVersion: js.UndefOr[java.lang.String] = js.undefined
}

object ClientInfo {
  @scala.inline
  def apply(
    clientName: java.lang.String = null,
    clientReferenceId: java.lang.String = null,
    clientVersion: java.lang.String = null
  ): ClientInfo = {
    val __obj = js.Dynamic.literal()
    if (clientName != null) __obj.updateDynamic("clientName")(clientName)
    if (clientReferenceId != null) __obj.updateDynamic("clientReferenceId")(clientReferenceId)
    if (clientVersion != null) __obj.updateDynamic("clientVersion")(clientVersion)
    __obj.asInstanceOf[ClientInfo]
  }
}

