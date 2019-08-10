package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatIntelligenceDetail extends js.Object {
  /**
    * The name of the threat intelligence list that triggered the finding.
    */
  var ThreatListName: js.UndefOr[String] = js.undefined
  /**
    * A list of names of the threats in the threat intelligence list that triggered the finding.
    */
  var ThreatNames: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.ThreatNames] = js.undefined
}

object ThreatIntelligenceDetail {
  @scala.inline
  def apply(ThreatListName: String = null, ThreatNames: ThreatNames = null): ThreatIntelligenceDetail = {
    val __obj = js.Dynamic.literal()
    if (ThreatListName != null) __obj.updateDynamic("ThreatListName")(ThreatListName)
    if (ThreatNames != null) __obj.updateDynamic("ThreatNames")(ThreatNames)
    __obj.asInstanceOf[ThreatIntelligenceDetail]
  }
}

