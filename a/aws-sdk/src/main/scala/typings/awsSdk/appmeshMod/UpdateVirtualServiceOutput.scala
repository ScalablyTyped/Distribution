package typings.awsSdk.appmeshMod

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
  
  extension [Self <: UpdateVirtualServiceOutput](x: Self) {
    
    inline def setVirtualService(value: VirtualServiceData): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
