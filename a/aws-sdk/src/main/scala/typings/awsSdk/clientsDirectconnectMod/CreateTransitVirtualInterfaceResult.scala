package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitVirtualInterfaceResult extends StObject {
  
  var virtualInterface: js.UndefOr[VirtualInterface] = js.undefined
}
object CreateTransitVirtualInterfaceResult {
  
  inline def apply(): CreateTransitVirtualInterfaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitVirtualInterfaceResult]
  }
  
  extension [Self <: CreateTransitVirtualInterfaceResult](x: Self) {
    
    inline def setVirtualInterface(value: VirtualInterface): Self = StObject.set(x, "virtualInterface", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceUndefined: Self = StObject.set(x, "virtualInterface", js.undefined)
  }
}
