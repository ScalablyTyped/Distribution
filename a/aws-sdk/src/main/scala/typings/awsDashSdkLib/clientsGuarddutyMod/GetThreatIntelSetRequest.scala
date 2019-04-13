package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetThreatIntelSetRequest extends js.Object {
  /**
    * The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to describe.
    */
  var DetectorId: __string
  /**
    * The unique ID that specifies the ThreatIntelSet that you want to describe.
    */
  var ThreatIntelSetId: __string
}

object GetThreatIntelSetRequest {
  @scala.inline
  def apply(DetectorId: __string, ThreatIntelSetId: __string): GetThreatIntelSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, ThreatIntelSetId = ThreatIntelSetId)
  
    __obj.asInstanceOf[GetThreatIntelSetRequest]
  }
}

