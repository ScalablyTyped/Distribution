package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateTransitVirtualInterfaceResult extends StObject {
  
  var virtualInterface: js.UndefOr[VirtualInterface] = js.undefined
}
object AllocateTransitVirtualInterfaceResult {
  
  inline def apply(): AllocateTransitVirtualInterfaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateTransitVirtualInterfaceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllocateTransitVirtualInterfaceResult] (val x: Self) extends AnyVal {
    
    inline def setVirtualInterface(value: VirtualInterface): Self = StObject.set(x, "virtualInterface", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceUndefined: Self = StObject.set(x, "virtualInterface", js.undefined)
  }
}
