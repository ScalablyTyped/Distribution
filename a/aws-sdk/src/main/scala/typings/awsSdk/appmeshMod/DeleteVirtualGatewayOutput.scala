package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVirtualGatewayOutput extends StObject {
  
  /**
    * The virtual gateway that was deleted.
    */
  var virtualGateway: VirtualGatewayData
}
object DeleteVirtualGatewayOutput {
  
  @scala.inline
  def apply(virtualGateway: VirtualGatewayData): DeleteVirtualGatewayOutput = {
    val __obj = js.Dynamic.literal(virtualGateway = virtualGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualGatewayOutput]
  }
  
  @scala.inline
  implicit class DeleteVirtualGatewayOutputMutableBuilder[Self <: DeleteVirtualGatewayOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualGateway(value: VirtualGatewayData): Self = StObject.set(x, "virtualGateway", value.asInstanceOf[js.Any])
  }
}
