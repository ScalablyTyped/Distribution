package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVirtualRouterOutput extends StObject {
  
  /**
    * A full description of the virtual router that was updated.
    */
  var virtualRouter: VirtualRouterData
}
object UpdateVirtualRouterOutput {
  
  inline def apply(virtualRouter: VirtualRouterData): UpdateVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVirtualRouterOutput]
  }
  
  extension [Self <: UpdateVirtualRouterOutput](x: Self) {
    
    inline def setVirtualRouter(value: VirtualRouterData): Self = StObject.set(x, "virtualRouter", value.asInstanceOf[js.Any])
  }
}
