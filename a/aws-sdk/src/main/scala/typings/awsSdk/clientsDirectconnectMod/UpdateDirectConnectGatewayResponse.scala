package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDirectConnectGatewayResponse extends StObject {
  
  var directConnectGateway: js.UndefOr[DirectConnectGateway] = js.undefined
}
object UpdateDirectConnectGatewayResponse {
  
  inline def apply(): UpdateDirectConnectGatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDirectConnectGatewayResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDirectConnectGatewayResponse] (val x: Self) extends AnyVal {
    
    inline def setDirectConnectGateway(value: DirectConnectGateway): Self = StObject.set(x, "directConnectGateway", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayUndefined: Self = StObject.set(x, "directConnectGateway", js.undefined)
  }
}
