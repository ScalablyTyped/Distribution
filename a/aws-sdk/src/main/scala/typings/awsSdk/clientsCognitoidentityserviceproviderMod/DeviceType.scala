package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceType extends StObject {
  
  /**
    * The device attributes.
    */
  var DeviceAttributes: js.UndefOr[AttributeListType] = js.undefined
  
  /**
    * The creation date of the device.
    */
  var DeviceCreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The device key.
    */
  var DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined
  
  /**
    * The date when the device was last authenticated.
    */
  var DeviceLastAuthenticatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last modified date of the device.
    */
  var DeviceLastModifiedDate: js.UndefOr[js.Date] = js.undefined
}
object DeviceType {
  
  inline def apply(): DeviceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceType] (val x: Self) extends AnyVal {
    
    inline def setDeviceAttributes(value: AttributeListType): Self = StObject.set(x, "DeviceAttributes", value.asInstanceOf[js.Any])
    
    inline def setDeviceAttributesUndefined: Self = StObject.set(x, "DeviceAttributes", js.undefined)
    
    inline def setDeviceAttributesVarargs(value: AttributeType*): Self = StObject.set(x, "DeviceAttributes", js.Array(value*))
    
    inline def setDeviceCreateDate(value: js.Date): Self = StObject.set(x, "DeviceCreateDate", value.asInstanceOf[js.Any])
    
    inline def setDeviceCreateDateUndefined: Self = StObject.set(x, "DeviceCreateDate", js.undefined)
    
    inline def setDeviceKey(value: DeviceKeyType): Self = StObject.set(x, "DeviceKey", value.asInstanceOf[js.Any])
    
    inline def setDeviceKeyUndefined: Self = StObject.set(x, "DeviceKey", js.undefined)
    
    inline def setDeviceLastAuthenticatedDate(value: js.Date): Self = StObject.set(x, "DeviceLastAuthenticatedDate", value.asInstanceOf[js.Any])
    
    inline def setDeviceLastAuthenticatedDateUndefined: Self = StObject.set(x, "DeviceLastAuthenticatedDate", js.undefined)
    
    inline def setDeviceLastModifiedDate(value: js.Date): Self = StObject.set(x, "DeviceLastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setDeviceLastModifiedDateUndefined: Self = StObject.set(x, "DeviceLastModifiedDate", js.undefined)
  }
}
