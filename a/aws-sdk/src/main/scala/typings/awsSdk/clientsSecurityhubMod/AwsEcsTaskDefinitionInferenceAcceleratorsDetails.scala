package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionInferenceAcceleratorsDetails extends StObject {
  
  /**
    * The Elastic Inference accelerator device name.
    */
  var DeviceName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Elastic Inference accelerator type to use.
    */
  var DeviceType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionInferenceAcceleratorsDetails {
  
  inline def apply(): AwsEcsTaskDefinitionInferenceAcceleratorsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionInferenceAcceleratorsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsTaskDefinitionInferenceAcceleratorsDetails] (val x: Self) extends AnyVal {
    
    inline def setDeviceName(value: NonEmptyString): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setDeviceType(value: NonEmptyString): Self = StObject.set(x, "DeviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "DeviceType", js.undefined)
  }
}
