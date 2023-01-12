package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVirtualRouterOutput extends StObject {
  
  /**
    * The full description of your virtual router following the create call.
    */
  var virtualRouter: VirtualRouterData
}
object CreateVirtualRouterOutput {
  
  inline def apply(virtualRouter: VirtualRouterData): CreateVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualRouterOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVirtualRouterOutput] (val x: Self) extends AnyVal {
    
    inline def setVirtualRouter(value: VirtualRouterData): Self = StObject.set(x, "virtualRouter", value.asInstanceOf[js.Any])
  }
}
