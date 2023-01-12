package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTransitGatewayResult extends StObject {
  
  var TransitGateway: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGateway] = js.undefined
}
object ModifyTransitGatewayResult {
  
  inline def apply(): ModifyTransitGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTransitGatewayResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyTransitGatewayResult] (val x: Self) extends AnyVal {
    
    inline def setTransitGateway(value: TransitGateway): Self = StObject.set(x, "TransitGateway", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayUndefined: Self = StObject.set(x, "TransitGateway", js.undefined)
  }
}
