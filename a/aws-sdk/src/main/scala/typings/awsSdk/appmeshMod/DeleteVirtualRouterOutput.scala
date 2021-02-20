package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVirtualRouterOutput extends StObject {
  
  /**
    * The virtual router that was deleted.
    */
  var virtualRouter: VirtualRouterData = js.native
}
object DeleteVirtualRouterOutput {
  
  @scala.inline
  def apply(virtualRouter: VirtualRouterData): DeleteVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualRouterOutput]
  }
  
  @scala.inline
  implicit class DeleteVirtualRouterOutputMutableBuilder[Self <: DeleteVirtualRouterOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualRouter(value: VirtualRouterData): Self = StObject.set(x, "virtualRouter", value.asInstanceOf[js.Any])
  }
}
