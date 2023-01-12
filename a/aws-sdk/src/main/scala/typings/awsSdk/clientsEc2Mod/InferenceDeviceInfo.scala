package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceDeviceInfo extends StObject {
  
  /**
    * The number of Inference accelerators for the instance type.
    */
  var Count: js.UndefOr[InferenceDeviceCount] = js.undefined
  
  /**
    * The manufacturer of the Inference accelerator.
    */
  var Manufacturer: js.UndefOr[InferenceDeviceManufacturerName] = js.undefined
  
  /**
    * The name of the Inference accelerator.
    */
  var Name: js.UndefOr[InferenceDeviceName] = js.undefined
}
object InferenceDeviceInfo {
  
  inline def apply(): InferenceDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceDeviceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InferenceDeviceInfo] (val x: Self) extends AnyVal {
    
    inline def setCount(value: InferenceDeviceCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setManufacturer(value: InferenceDeviceManufacturerName): Self = StObject.set(x, "Manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "Manufacturer", js.undefined)
    
    inline def setName(value: InferenceDeviceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
