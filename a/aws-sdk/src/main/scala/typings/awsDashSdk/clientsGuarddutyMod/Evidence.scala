package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Evidence extends js.Object {
  /**
    * A list of threat intelligence details related to the evidence.
    */
  var ThreatIntelligenceDetails: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.ThreatIntelligenceDetails] = js.native
}

object Evidence {
  @scala.inline
  def apply(ThreatIntelligenceDetails: ThreatIntelligenceDetails = null): Evidence = {
    val __obj = js.Dynamic.literal()
    if (ThreatIntelligenceDetails != null) __obj.updateDynamic("ThreatIntelligenceDetails")(ThreatIntelligenceDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evidence]
  }
}

