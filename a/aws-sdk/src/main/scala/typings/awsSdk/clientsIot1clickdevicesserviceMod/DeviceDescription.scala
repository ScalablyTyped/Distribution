package typings.awsSdk.clientsIot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDescription extends StObject {
  
  /**
    * The ARN of the device.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * An array of zero or more elements of DeviceAttribute objects providing
    user specified device attributes.
    */
  var Attributes: js.UndefOr[DeviceAttributes] = js.undefined
  
  /**
    * The unique identifier of the device.
    */
  var DeviceId: js.UndefOr[string] = js.undefined
  
  /**
    * A Boolean value indicating whether or not the device is enabled.
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
  
  /**
    * A value between 0 and 1 inclusive, representing the fraction of life remaining for the
    device.
    */
  var RemainingLife: js.UndefOr[doubleMin0Max100] = js.undefined
  
  /**
    * The tags currently associated with the AWS IoT 1-Click device.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * The type of the device, such as "button".
    */
  var Type: js.UndefOr[string] = js.undefined
}
object DeviceDescription {
  
  inline def apply(): DeviceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceDescription] (val x: Self) extends AnyVal {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAttributes(value: DeviceAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setRemainingLife(value: doubleMin0Max100): Self = StObject.set(x, "RemainingLife", value.asInstanceOf[js.Any])
    
    inline def setRemainingLifeUndefined: Self = StObject.set(x, "RemainingLife", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: string): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
