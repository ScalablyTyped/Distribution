package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualRouterListener extends StObject {
  
  var portMapping: PortMapping
}
object VirtualRouterListener {
  
  inline def apply(portMapping: PortMapping): VirtualRouterListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterListener]
  }
  
  extension [Self <: VirtualRouterListener](x: Self) {
    
    inline def setPortMapping(value: PortMapping): Self = StObject.set(x, "portMapping", value.asInstanceOf[js.Any])
  }
}
