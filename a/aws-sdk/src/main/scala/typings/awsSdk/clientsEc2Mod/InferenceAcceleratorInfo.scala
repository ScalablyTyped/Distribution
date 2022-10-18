package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceAcceleratorInfo extends StObject {
  
  /**
    * Describes the Inference accelerators for the instance type.
    */
  var Accelerators: js.UndefOr[InferenceDeviceInfoList] = js.undefined
}
object InferenceAcceleratorInfo {
  
  inline def apply(): InferenceAcceleratorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceAcceleratorInfo]
  }
  
  extension [Self <: InferenceAcceleratorInfo](x: Self) {
    
    inline def setAccelerators(value: InferenceDeviceInfoList): Self = StObject.set(x, "Accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "Accelerators", js.undefined)
    
    inline def setAcceleratorsVarargs(value: InferenceDeviceInfo*): Self = StObject.set(x, "Accelerators", js.Array(value*))
  }
}
