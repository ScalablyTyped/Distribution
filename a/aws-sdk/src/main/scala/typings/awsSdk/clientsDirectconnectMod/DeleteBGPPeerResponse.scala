package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBGPPeerResponse extends StObject {
  
  /**
    * The virtual interface.
    */
  var virtualInterface: js.UndefOr[VirtualInterface] = js.undefined
}
object DeleteBGPPeerResponse {
  
  inline def apply(): DeleteBGPPeerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBGPPeerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBGPPeerResponse] (val x: Self) extends AnyVal {
    
    inline def setVirtualInterface(value: VirtualInterface): Self = StObject.set(x, "virtualInterface", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceUndefined: Self = StObject.set(x, "virtualInterface", js.undefined)
  }
}
