package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGatewayResponse extends StObject {
  
  var Gateway: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Gateway] = js.undefined
}
object CreateGatewayResponse {
  
  inline def apply(): CreateGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGatewayResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGatewayResponse] (val x: Self) extends AnyVal {
    
    inline def setGateway(value: Gateway): Self = StObject.set(x, "Gateway", value.asInstanceOf[js.Any])
    
    inline def setGatewayUndefined: Self = StObject.set(x, "Gateway", js.undefined)
  }
}
