package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomRoutingAcceleratorAttributesResponse extends StObject {
  
  /**
    * The attributes of the custom routing accelerator.
    */
  var AcceleratorAttributes: js.UndefOr[CustomRoutingAcceleratorAttributes] = js.undefined
}
object DescribeCustomRoutingAcceleratorAttributesResponse {
  
  inline def apply(): DescribeCustomRoutingAcceleratorAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomRoutingAcceleratorAttributesResponse]
  }
  
  extension [Self <: DescribeCustomRoutingAcceleratorAttributesResponse](x: Self) {
    
    inline def setAcceleratorAttributes(value: CustomRoutingAcceleratorAttributes): Self = StObject.set(x, "AcceleratorAttributes", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorAttributesUndefined: Self = StObject.set(x, "AcceleratorAttributes", js.undefined)
  }
}
