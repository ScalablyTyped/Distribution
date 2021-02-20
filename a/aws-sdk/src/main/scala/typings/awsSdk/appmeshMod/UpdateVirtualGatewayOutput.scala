package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVirtualGatewayOutput extends StObject {
  
  /**
    * A full description of the virtual gateway that was updated.
    */
  var virtualGateway: VirtualGatewayData = js.native
}
object UpdateVirtualGatewayOutput {
  
  @scala.inline
  def apply(virtualGateway: VirtualGatewayData): UpdateVirtualGatewayOutput = {
    val __obj = js.Dynamic.literal(virtualGateway = virtualGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVirtualGatewayOutput]
  }
  
  @scala.inline
  implicit class UpdateVirtualGatewayOutputMutableBuilder[Self <: UpdateVirtualGatewayOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualGateway(value: VirtualGatewayData): Self = StObject.set(x, "virtualGateway", value.asInstanceOf[js.Any])
  }
}
