package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVirtualServiceOutput extends StObject {
  
  /**
    * The full description of your virtual service following the create call.
    */
  var virtualService: VirtualServiceData
}
object CreateVirtualServiceOutput {
  
  inline def apply(virtualService: VirtualServiceData): CreateVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualServiceOutput]
  }
  
  extension [Self <: CreateVirtualServiceOutput](x: Self) {
    
    inline def setVirtualService(value: VirtualServiceData): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
