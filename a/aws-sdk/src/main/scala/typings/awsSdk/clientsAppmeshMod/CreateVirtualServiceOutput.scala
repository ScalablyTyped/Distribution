package typings.awsSdk.clientsAppmeshMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVirtualServiceOutput] (val x: Self) extends AnyVal {
    
    inline def setVirtualService(value: VirtualServiceData): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
