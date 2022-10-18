package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Evidence extends StObject {
  
  /**
    * A list of threat intelligence details related to the evidence.
    */
  var ThreatIntelligenceDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.ThreatIntelligenceDetails] = js.undefined
}
object Evidence {
  
  inline def apply(): Evidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Evidence]
  }
  
  extension [Self <: Evidence](x: Self) {
    
    inline def setThreatIntelligenceDetails(value: ThreatIntelligenceDetails): Self = StObject.set(x, "ThreatIntelligenceDetails", value.asInstanceOf[js.Any])
    
    inline def setThreatIntelligenceDetailsUndefined: Self = StObject.set(x, "ThreatIntelligenceDetails", js.undefined)
    
    inline def setThreatIntelligenceDetailsVarargs(value: ThreatIntelligenceDetail*): Self = StObject.set(x, "ThreatIntelligenceDetails", js.Array(value*))
  }
}
