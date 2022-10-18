package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSmartHomeAppliancesResponse extends StObject {
  
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  
  /**
    * The smart home appliances.
    */
  var SmartHomeAppliances: js.UndefOr[SmartHomeApplianceList] = js.undefined
}
object ListSmartHomeAppliancesResponse {
  
  inline def apply(): ListSmartHomeAppliancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSmartHomeAppliancesResponse]
  }
  
  extension [Self <: ListSmartHomeAppliancesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSmartHomeAppliances(value: SmartHomeApplianceList): Self = StObject.set(x, "SmartHomeAppliances", value.asInstanceOf[js.Any])
    
    inline def setSmartHomeAppliancesUndefined: Self = StObject.set(x, "SmartHomeAppliances", js.undefined)
    
    inline def setSmartHomeAppliancesVarargs(value: SmartHomeAppliance*): Self = StObject.set(x, "SmartHomeAppliances", js.Array(value*))
  }
}
