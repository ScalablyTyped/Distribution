package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectConnectGatewayResult extends StObject {
  
  /**
    * The Direct Connect gateway.
    */
  var directConnectGateway: js.UndefOr[DirectConnectGateway] = js.undefined
}
object CreateDirectConnectGatewayResult {
  
  inline def apply(): CreateDirectConnectGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDirectConnectGatewayResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDirectConnectGatewayResult] (val x: Self) extends AnyVal {
    
    inline def setDirectConnectGateway(value: DirectConnectGateway): Self = StObject.set(x, "directConnectGateway", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayUndefined: Self = StObject.set(x, "directConnectGateway", js.undefined)
  }
}
