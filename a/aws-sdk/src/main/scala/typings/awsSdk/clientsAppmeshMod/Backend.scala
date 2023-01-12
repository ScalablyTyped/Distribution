package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backend extends StObject {
  
  /**
    * Specifies a virtual service to use as a backend. 
    */
  var virtualService: js.UndefOr[VirtualServiceBackend] = js.undefined
}
object Backend {
  
  inline def apply(): Backend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Backend] (val x: Self) extends AnyVal {
    
    inline def setVirtualService(value: VirtualServiceBackend): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
    
    inline def setVirtualServiceUndefined: Self = StObject.set(x, "virtualService", js.undefined)
  }
}
