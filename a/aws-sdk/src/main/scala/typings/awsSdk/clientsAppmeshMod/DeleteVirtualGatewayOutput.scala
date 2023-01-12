package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVirtualGatewayOutput extends StObject {
  
  /**
    * The virtual gateway that was deleted.
    */
  var virtualGateway: VirtualGatewayData
}
object DeleteVirtualGatewayOutput {
  
  inline def apply(virtualGateway: VirtualGatewayData): DeleteVirtualGatewayOutput = {
    val __obj = js.Dynamic.literal(virtualGateway = virtualGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualGatewayOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVirtualGatewayOutput] (val x: Self) extends AnyVal {
    
    inline def setVirtualGateway(value: VirtualGatewayData): Self = StObject.set(x, "virtualGateway", value.asInstanceOf[js.Any])
  }
}
