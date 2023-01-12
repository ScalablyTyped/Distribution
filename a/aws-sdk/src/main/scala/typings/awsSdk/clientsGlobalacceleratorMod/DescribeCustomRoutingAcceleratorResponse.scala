package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomRoutingAcceleratorResponse extends StObject {
  
  /**
    * The description of the custom routing accelerator.
    */
  var Accelerator: js.UndefOr[CustomRoutingAccelerator] = js.undefined
}
object DescribeCustomRoutingAcceleratorResponse {
  
  inline def apply(): DescribeCustomRoutingAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomRoutingAcceleratorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCustomRoutingAcceleratorResponse] (val x: Self) extends AnyVal {
    
    inline def setAccelerator(value: CustomRoutingAccelerator): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorUndefined: Self = StObject.set(x, "Accelerator", js.undefined)
  }
}
