package typings.awsSdk.clientsElasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAcceleratorTypesResponse extends StObject {
  
  /**
    *  The available accelerator types. 
    */
  var acceleratorTypes: js.UndefOr[AcceleratorTypeList] = js.undefined
}
object DescribeAcceleratorTypesResponse {
  
  inline def apply(): DescribeAcceleratorTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAcceleratorTypesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAcceleratorTypesResponse] (val x: Self) extends AnyVal {
    
    inline def setAcceleratorTypes(value: AcceleratorTypeList): Self = StObject.set(x, "acceleratorTypes", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypesUndefined: Self = StObject.set(x, "acceleratorTypes", js.undefined)
    
    inline def setAcceleratorTypesVarargs(value: AcceleratorType*): Self = StObject.set(x, "acceleratorTypes", js.Array(value*))
  }
}
