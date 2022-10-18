package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThreatIntelSetResponse extends StObject {
  
  /**
    * The ID of the ThreatIntelSet resource.
    */
  var ThreatIntelSetId: String
}
object CreateThreatIntelSetResponse {
  
  inline def apply(ThreatIntelSetId: String): CreateThreatIntelSetResponse = {
    val __obj = js.Dynamic.literal(ThreatIntelSetId = ThreatIntelSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThreatIntelSetResponse]
  }
  
  extension [Self <: CreateThreatIntelSetResponse](x: Self) {
    
    inline def setThreatIntelSetId(value: String): Self = StObject.set(x, "ThreatIntelSetId", value.asInstanceOf[js.Any])
  }
}
