package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backend extends StObject {
  
  /**
    * Specifies a virtual service to use as a backend. 
    */
  var virtualService: js.UndefOr[VirtualServiceBackend] = js.native
}
object Backend {
  
  @scala.inline
  def apply(): Backend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backend]
  }
  
  @scala.inline
  implicit class BackendMutableBuilder[Self <: Backend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualService(value: VirtualServiceBackend): Self = StObject.set(x, "virtualService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualServiceUndefined: Self = StObject.set(x, "virtualService", js.undefined)
  }
}
