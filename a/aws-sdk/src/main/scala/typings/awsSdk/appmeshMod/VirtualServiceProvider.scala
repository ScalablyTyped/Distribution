package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualServiceProvider extends StObject {
  
  /**
    * The virtual node associated with a virtual service.
    */
  var virtualNode: js.UndefOr[VirtualNodeServiceProvider] = js.undefined
  
  /**
    * The virtual router associated with a virtual service.
    */
  var virtualRouter: js.UndefOr[VirtualRouterServiceProvider] = js.undefined
}
object VirtualServiceProvider {
  
  inline def apply(): VirtualServiceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualServiceProvider]
  }
  
  extension [Self <: VirtualServiceProvider](x: Self) {
    
    inline def setVirtualNode(value: VirtualNodeServiceProvider): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
    
    inline def setVirtualNodeUndefined: Self = StObject.set(x, "virtualNode", js.undefined)
    
    inline def setVirtualRouter(value: VirtualRouterServiceProvider): Self = StObject.set(x, "virtualRouter", value.asInstanceOf[js.Any])
    
    inline def setVirtualRouterUndefined: Self = StObject.set(x, "virtualRouter", js.undefined)
  }
}
