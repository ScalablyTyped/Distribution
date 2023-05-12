package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcsInferenceAcceleratorOverride extends StObject {
  
  /**
    * The Elastic Inference accelerator device name to override for the task. This parameter must match a deviceName specified in the task definition.
    */
  var deviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The Elastic Inference accelerator type to use.
    */
  var deviceType: js.UndefOr[String] = js.undefined
}
object EcsInferenceAcceleratorOverride {
  
  inline def apply(): EcsInferenceAcceleratorOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcsInferenceAcceleratorOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcsInferenceAcceleratorOverride] (val x: Self) extends AnyVal {
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
  }
}
