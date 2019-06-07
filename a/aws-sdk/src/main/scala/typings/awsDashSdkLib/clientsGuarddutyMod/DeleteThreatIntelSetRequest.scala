package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteThreatIntelSetRequest extends js.Object {
  /**
    * The unique ID of the detector the threatIntelSet is associated with.
    */
  var DetectorId: awsDashSdkLib.clientsGuarddutyMod.DetectorId
  /**
    * The unique ID of the threatIntelSet you want to delete.
    */
  var ThreatIntelSetId: String
}

object DeleteThreatIntelSetRequest {
  @scala.inline
  def apply(DetectorId: DetectorId, ThreatIntelSetId: String): DeleteThreatIntelSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, ThreatIntelSetId = ThreatIntelSetId)
  
    __obj.asInstanceOf[DeleteThreatIntelSetRequest]
  }
}

