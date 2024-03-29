package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomRoutingAcceleratorResponse extends StObject {
  
  /**
    * Information about the updated custom routing accelerator.
    */
  var Accelerator: js.UndefOr[CustomRoutingAccelerator] = js.undefined
}
object UpdateCustomRoutingAcceleratorResponse {
  
  inline def apply(): UpdateCustomRoutingAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCustomRoutingAcceleratorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCustomRoutingAcceleratorResponse] (val x: Self) extends AnyVal {
    
    inline def setAccelerator(value: CustomRoutingAccelerator): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorUndefined: Self = StObject.set(x, "Accelerator", js.undefined)
  }
}
