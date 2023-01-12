package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAcceleratorAttributesResponse extends StObject {
  
  /**
    * The attributes of the accelerator.
    */
  var AcceleratorAttributes: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.AcceleratorAttributes] = js.undefined
}
object DescribeAcceleratorAttributesResponse {
  
  inline def apply(): DescribeAcceleratorAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAcceleratorAttributesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAcceleratorAttributesResponse] (val x: Self) extends AnyVal {
    
    inline def setAcceleratorAttributes(value: AcceleratorAttributes): Self = StObject.set(x, "AcceleratorAttributes", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorAttributesUndefined: Self = StObject.set(x, "AcceleratorAttributes", js.undefined)
  }
}
