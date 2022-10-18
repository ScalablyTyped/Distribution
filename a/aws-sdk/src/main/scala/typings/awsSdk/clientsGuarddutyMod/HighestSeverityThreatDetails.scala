package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighestSeverityThreatDetails extends StObject {
  
  /**
    * Total number of infected files with the highest severity threat detected.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * Severity level of the highest severity threat detected.
    */
  var Severity: js.UndefOr[String] = js.undefined
  
  /**
    * Threat name of the highest severity threat detected as part of the malware scan.
    */
  var ThreatName: js.UndefOr[String] = js.undefined
}
object HighestSeverityThreatDetails {
  
  inline def apply(): HighestSeverityThreatDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighestSeverityThreatDetails]
  }
  
  extension [Self <: HighestSeverityThreatDetails](x: Self) {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    inline def setThreatName(value: String): Self = StObject.set(x, "ThreatName", value.asInstanceOf[js.Any])
    
    inline def setThreatNameUndefined: Self = StObject.set(x, "ThreatName", js.undefined)
  }
}
