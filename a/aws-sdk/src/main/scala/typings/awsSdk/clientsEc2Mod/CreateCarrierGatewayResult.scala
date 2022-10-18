package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCarrierGatewayResult extends StObject {
  
  /**
    * Information about the carrier gateway.
    */
  var CarrierGateway: js.UndefOr[typings.awsSdk.clientsEc2Mod.CarrierGateway] = js.undefined
}
object CreateCarrierGatewayResult {
  
  inline def apply(): CreateCarrierGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCarrierGatewayResult]
  }
  
  extension [Self <: CreateCarrierGatewayResult](x: Self) {
    
    inline def setCarrierGateway(value: CarrierGateway): Self = StObject.set(x, "CarrierGateway", value.asInstanceOf[js.Any])
    
    inline def setCarrierGatewayUndefined: Self = StObject.set(x, "CarrierGateway", js.undefined)
  }
}
