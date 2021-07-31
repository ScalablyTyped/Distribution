package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeServiceProvider extends StObject {
  
  /**
    * The name of the virtual node that is acting as a service provider.
    */
  var virtualNodeName: ResourceName
}
object VirtualNodeServiceProvider {
  
  @scala.inline
  def apply(virtualNodeName: ResourceName): VirtualNodeServiceProvider = {
    val __obj = js.Dynamic.literal(virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeServiceProvider]
  }
  
  @scala.inline
  implicit class VirtualNodeServiceProviderMutableBuilder[Self <: VirtualNodeServiceProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualNodeName(value: ResourceName): Self = StObject.set(x, "virtualNodeName", value.asInstanceOf[js.Any])
  }
}
