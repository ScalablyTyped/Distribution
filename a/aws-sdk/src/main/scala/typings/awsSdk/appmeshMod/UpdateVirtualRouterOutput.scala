package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVirtualRouterOutput extends StObject {
  
  /**
    * A full description of the virtual router that was updated.
    */
  var virtualRouter: VirtualRouterData = js.native
}
object UpdateVirtualRouterOutput {
  
  @scala.inline
  def apply(virtualRouter: VirtualRouterData): UpdateVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVirtualRouterOutput]
  }
  
  @scala.inline
  implicit class UpdateVirtualRouterOutputMutableBuilder[Self <: UpdateVirtualRouterOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualRouter(value: VirtualRouterData): Self = StObject.set(x, "virtualRouter", value.asInstanceOf[js.Any])
  }
}
