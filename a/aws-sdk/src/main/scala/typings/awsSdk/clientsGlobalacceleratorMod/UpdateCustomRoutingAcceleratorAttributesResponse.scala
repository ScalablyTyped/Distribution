package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomRoutingAcceleratorAttributesResponse extends StObject {
  
  /**
    * Updated custom routing accelerator.
    */
  var AcceleratorAttributes: js.UndefOr[CustomRoutingAcceleratorAttributes] = js.undefined
}
object UpdateCustomRoutingAcceleratorAttributesResponse {
  
  inline def apply(): UpdateCustomRoutingAcceleratorAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCustomRoutingAcceleratorAttributesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCustomRoutingAcceleratorAttributesResponse] (val x: Self) extends AnyVal {
    
    inline def setAcceleratorAttributes(value: CustomRoutingAcceleratorAttributes): Self = StObject.set(x, "AcceleratorAttributes", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorAttributesUndefined: Self = StObject.set(x, "AcceleratorAttributes", js.undefined)
  }
}
