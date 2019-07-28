package typings.apolloDashEngineDashReporting.distAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientInfo extends js.Object {
  var clientName: js.UndefOr[String] = js.undefined
  var clientReferenceId: js.UndefOr[String] = js.undefined
  var clientVersion: js.UndefOr[String] = js.undefined
}

object ClientInfo {
  @scala.inline
  def apply(clientName: String = null, clientReferenceId: String = null, clientVersion: String = null): ClientInfo = {
    val __obj = js.Dynamic.literal()
    if (clientName != null) __obj.updateDynamic("clientName")(clientName)
    if (clientReferenceId != null) __obj.updateDynamic("clientReferenceId")(clientReferenceId)
    if (clientVersion != null) __obj.updateDynamic("clientVersion")(clientVersion)
    __obj.asInstanceOf[ClientInfo]
  }
}

