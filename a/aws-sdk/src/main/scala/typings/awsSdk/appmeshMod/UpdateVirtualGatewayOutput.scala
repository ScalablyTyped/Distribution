package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVirtualGatewayOutput extends js.Object {
  
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
  implicit class UpdateVirtualGatewayOutputOps[Self <: UpdateVirtualGatewayOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVirtualGateway(value: VirtualGatewayData): Self = this.set("virtualGateway", value.asInstanceOf[js.Any])
  }
}
