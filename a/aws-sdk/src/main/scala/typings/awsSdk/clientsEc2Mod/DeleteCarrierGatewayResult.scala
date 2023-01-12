package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCarrierGatewayResult extends StObject {
  
  /**
    * Information about the carrier gateway.
    */
  var CarrierGateway: js.UndefOr[typings.awsSdk.clientsEc2Mod.CarrierGateway] = js.undefined
}
object DeleteCarrierGatewayResult {
  
  inline def apply(): DeleteCarrierGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCarrierGatewayResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCarrierGatewayResult] (val x: Self) extends AnyVal {
    
    inline def setCarrierGateway(value: CarrierGateway): Self = StObject.set(x, "CarrierGateway", value.asInstanceOf[js.Any])
    
    inline def setCarrierGatewayUndefined: Self = StObject.set(x, "CarrierGateway", js.undefined)
  }
}
