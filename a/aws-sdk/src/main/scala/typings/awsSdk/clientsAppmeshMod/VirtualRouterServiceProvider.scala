package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualRouterServiceProvider extends StObject {
  
  /**
    * The name of the virtual router that is acting as a service provider.
    */
  var virtualRouterName: ResourceName
}
object VirtualRouterServiceProvider {
  
  inline def apply(virtualRouterName: ResourceName): VirtualRouterServiceProvider = {
    val __obj = js.Dynamic.literal(virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterServiceProvider]
  }
  
  extension [Self <: VirtualRouterServiceProvider](x: Self) {
    
    inline def setVirtualRouterName(value: ResourceName): Self = StObject.set(x, "virtualRouterName", value.asInstanceOf[js.Any])
  }
}
