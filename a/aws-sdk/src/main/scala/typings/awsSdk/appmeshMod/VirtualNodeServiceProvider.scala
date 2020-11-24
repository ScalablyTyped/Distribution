package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeServiceProvider extends js.Object {
  
  /**
    * The name of the virtual node that is acting as a service provider.
    */
  var virtualNodeName: ResourceName = js.native
}
object VirtualNodeServiceProvider {
  
  @scala.inline
  def apply(virtualNodeName: ResourceName): VirtualNodeServiceProvider = {
    val __obj = js.Dynamic.literal(virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeServiceProvider]
  }
  
  @scala.inline
  implicit class VirtualNodeServiceProviderOps[Self <: VirtualNodeServiceProvider] (val x: Self) extends AnyVal {
    
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
    def setVirtualNodeName(value: ResourceName): Self = this.set("virtualNodeName", value.asInstanceOf[js.Any])
  }
}
