package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVirtualServiceOutput extends StObject {
  
  /**
    * A full description of the virtual service that was updated.
    */
  var virtualService: VirtualServiceData
}
object UpdateVirtualServiceOutput {
  
  inline def apply(virtualService: VirtualServiceData): UpdateVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVirtualServiceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVirtualServiceOutput] (val x: Self) extends AnyVal {
    
    inline def setVirtualService(value: VirtualServiceData): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
