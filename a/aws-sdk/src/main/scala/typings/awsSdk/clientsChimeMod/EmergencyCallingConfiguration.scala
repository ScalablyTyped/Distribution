package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmergencyCallingConfiguration extends StObject {
  
  /**
    * The Dialed Number Identification Service (DNIS) emergency calling configuration details.
    */
  var DNIS: js.UndefOr[DNISEmergencyCallingConfigurationList] = js.undefined
}
object EmergencyCallingConfiguration {
  
  inline def apply(): EmergencyCallingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmergencyCallingConfiguration]
  }
  
  extension [Self <: EmergencyCallingConfiguration](x: Self) {
    
    inline def setDNIS(value: DNISEmergencyCallingConfigurationList): Self = StObject.set(x, "DNIS", value.asInstanceOf[js.Any])
    
    inline def setDNISUndefined: Self = StObject.set(x, "DNIS", js.undefined)
    
    inline def setDNISVarargs(value: DNISEmergencyCallingConfiguration*): Self = StObject.set(x, "DNIS", js.Array(value*))
  }
}
