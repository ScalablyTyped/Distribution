package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualRouterSpec extends StObject {
  
  /**
    * The listeners that the virtual router is expected to receive inbound traffic from. You can specify one listener.
    */
  var listeners: js.UndefOr[VirtualRouterListeners] = js.undefined
}
object VirtualRouterSpec {
  
  inline def apply(): VirtualRouterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualRouterSpec]
  }
  
  extension [Self <: VirtualRouterSpec](x: Self) {
    
    inline def setListeners(value: VirtualRouterListeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    inline def setListenersVarargs(value: VirtualRouterListener*): Self = StObject.set(x, "listeners", js.Array(value*))
  }
}
