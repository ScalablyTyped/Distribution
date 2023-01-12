package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGatewayGroupResponse extends StObject {
  
  var GatewayGroup: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.GatewayGroup] = js.undefined
}
object GetGatewayGroupResponse {
  
  inline def apply(): GetGatewayGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGatewayGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGatewayGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setGatewayGroup(value: GatewayGroup): Self = StObject.set(x, "GatewayGroup", value.asInstanceOf[js.Any])
    
    inline def setGatewayGroupUndefined: Self = StObject.set(x, "GatewayGroup", js.undefined)
  }
}
