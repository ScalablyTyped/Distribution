package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGatewayGroupResponse extends StObject {
  
  var GatewayGroup: js.UndefOr[typings.awsSdk.alexaforbusinessMod.GatewayGroup] = js.undefined
}
object GetGatewayGroupResponse {
  
  inline def apply(): GetGatewayGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGatewayGroupResponse]
  }
  
  extension [Self <: GetGatewayGroupResponse](x: Self) {
    
    inline def setGatewayGroup(value: GatewayGroup): Self = StObject.set(x, "GatewayGroup", value.asInstanceOf[js.Any])
    
    inline def setGatewayGroupUndefined: Self = StObject.set(x, "GatewayGroup", js.undefined)
  }
}
