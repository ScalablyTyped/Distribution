package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVirtualServiceOutput extends StObject {
  
  /**
    * The virtual service that was deleted.
    */
  var virtualService: VirtualServiceData
}
object DeleteVirtualServiceOutput {
  
  @scala.inline
  def apply(virtualService: VirtualServiceData): DeleteVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualServiceOutput]
  }
  
  @scala.inline
  implicit class DeleteVirtualServiceOutputMutableBuilder[Self <: DeleteVirtualServiceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualService(value: VirtualServiceData): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
