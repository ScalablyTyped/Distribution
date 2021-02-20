package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualRouterSpec extends StObject {
  
  /**
    * The listeners that the virtual router is expected to receive inbound traffic from. You can specify one listener.
    */
  var listeners: js.UndefOr[VirtualRouterListeners] = js.native
}
object VirtualRouterSpec {
  
  @scala.inline
  def apply(): VirtualRouterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualRouterSpec]
  }
  
  @scala.inline
  implicit class VirtualRouterSpecMutableBuilder[Self <: VirtualRouterSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListeners(value: VirtualRouterListeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    @scala.inline
    def setListenersVarargs(value: VirtualRouterListener*): Self = StObject.set(x, "listeners", js.Array(value :_*))
  }
}
