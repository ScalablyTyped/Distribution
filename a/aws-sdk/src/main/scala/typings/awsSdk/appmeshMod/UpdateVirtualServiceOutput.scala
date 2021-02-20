package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVirtualServiceOutput extends StObject {
  
  /**
    * A full description of the virtual service that was updated.
    */
  var virtualService: VirtualServiceData = js.native
}
object UpdateVirtualServiceOutput {
  
  @scala.inline
  def apply(virtualService: VirtualServiceData): UpdateVirtualServiceOutput = {
    val __obj = js.Dynamic.literal(virtualService = virtualService.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVirtualServiceOutput]
  }
  
  @scala.inline
  implicit class UpdateVirtualServiceOutputMutableBuilder[Self <: UpdateVirtualServiceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualService(value: VirtualServiceData): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
  }
}
