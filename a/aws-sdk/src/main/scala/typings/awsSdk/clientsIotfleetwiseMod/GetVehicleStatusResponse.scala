package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVehicleStatusResponse extends StObject {
  
  /**
    *  Lists information about the state of the vehicle with deployed campaigns. 
    */
  var campaigns: js.UndefOr[VehicleStatusList] = js.undefined
  
  /**
    *  The token to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.nextToken] = js.undefined
}
object GetVehicleStatusResponse {
  
  inline def apply(): GetVehicleStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVehicleStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVehicleStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setCampaigns(value: VehicleStatusList): Self = StObject.set(x, "campaigns", value.asInstanceOf[js.Any])
    
    inline def setCampaignsUndefined: Self = StObject.set(x, "campaigns", js.undefined)
    
    inline def setCampaignsVarargs(value: VehicleStatus*): Self = StObject.set(x, "campaigns", js.Array(value*))
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
