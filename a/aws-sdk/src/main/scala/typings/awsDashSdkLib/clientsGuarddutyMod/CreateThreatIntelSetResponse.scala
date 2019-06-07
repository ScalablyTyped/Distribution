package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateThreatIntelSetResponse extends js.Object {
  /**
    * The ID of the ThreatIntelSet resource.
    */
  var ThreatIntelSetId: String
}

object CreateThreatIntelSetResponse {
  @scala.inline
  def apply(ThreatIntelSetId: String): CreateThreatIntelSetResponse = {
    val __obj = js.Dynamic.literal(ThreatIntelSetId = ThreatIntelSetId)
  
    __obj.asInstanceOf[CreateThreatIntelSetResponse]
  }
}

