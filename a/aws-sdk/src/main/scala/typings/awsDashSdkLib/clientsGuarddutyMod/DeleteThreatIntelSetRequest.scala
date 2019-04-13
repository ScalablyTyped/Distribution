package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteThreatIntelSetRequest extends js.Object {
  /**
    * The detectorID that specifies the GuardDuty service whose ThreatIntelSet you want to delete.
    */
  var DetectorId: __string
  /**
    * The unique ID that specifies the ThreatIntelSet that you want to delete.
    */
  var ThreatIntelSetId: __string
}

object DeleteThreatIntelSetRequest {
  @scala.inline
  def apply(DetectorId: __string, ThreatIntelSetId: __string): DeleteThreatIntelSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, ThreatIntelSetId = ThreatIntelSetId)
  
    __obj.asInstanceOf[DeleteThreatIntelSetRequest]
  }
}

