package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualServiceBackend extends StObject {
  
  /**
    * A reference to an object that represents the client policy for a backend.
    */
  var clientPolicy: js.UndefOr[ClientPolicy] = js.undefined
  
  /**
    * The name of the virtual service that is acting as a virtual node backend.
    */
  var virtualServiceName: ServiceName
}
object VirtualServiceBackend {
  
  @scala.inline
  def apply(virtualServiceName: ServiceName): VirtualServiceBackend = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceBackend]
  }
  
  @scala.inline
  implicit class VirtualServiceBackendMutableBuilder[Self <: VirtualServiceBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientPolicy(value: ClientPolicy): Self = StObject.set(x, "clientPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientPolicyUndefined: Self = StObject.set(x, "clientPolicy", js.undefined)
    
    @scala.inline
    def setVirtualServiceName(value: ServiceName): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
