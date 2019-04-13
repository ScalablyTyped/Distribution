package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateThreatIntelSetResponse extends js.Object {
  var ThreatIntelSetId: js.UndefOr[ThreatIntelSetId] = js.undefined
}

object CreateThreatIntelSetResponse {
  @scala.inline
  def apply(ThreatIntelSetId: ThreatIntelSetId = null): CreateThreatIntelSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ThreatIntelSetId != null) __obj.updateDynamic("ThreatIntelSetId")(ThreatIntelSetId)
    __obj.asInstanceOf[CreateThreatIntelSetResponse]
  }
}

