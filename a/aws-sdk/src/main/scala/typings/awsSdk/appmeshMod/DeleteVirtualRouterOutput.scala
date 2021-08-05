package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVirtualRouterOutput extends StObject {
  
  /**
    * The virtual router that was deleted.
    */
  var virtualRouter: VirtualRouterData
}
object DeleteVirtualRouterOutput {
  
  inline def apply(virtualRouter: VirtualRouterData): DeleteVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualRouterOutput]
  }
  
  extension [Self <: DeleteVirtualRouterOutput](x: Self) {
    
    inline def setVirtualRouter(value: VirtualRouterData): Self = StObject.set(x, "virtualRouter", value.asInstanceOf[js.Any])
  }
}
