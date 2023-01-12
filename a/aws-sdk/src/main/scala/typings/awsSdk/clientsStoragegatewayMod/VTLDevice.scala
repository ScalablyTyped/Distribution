package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VTLDevice extends StObject {
  
  /**
    * A list of iSCSI information about a VTL device.
    */
  var DeviceiSCSIAttributes: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.DeviceiSCSIAttributes] = js.undefined
  
  /**
    * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive or media changer).
    */
  var VTLDeviceARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.VTLDeviceARN] = js.undefined
  
  /**
    * Specifies the model number of device that the VTL device emulates.
    */
  var VTLDeviceProductIdentifier: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.VTLDeviceProductIdentifier] = js.undefined
  
  /**
    * Specifies the type of device that the VTL device emulates.
    */
  var VTLDeviceType: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.VTLDeviceType] = js.undefined
  
  /**
    * Specifies the vendor of the device that the VTL device object emulates.
    */
  var VTLDeviceVendor: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.VTLDeviceVendor] = js.undefined
}
object VTLDevice {
  
  inline def apply(): VTLDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VTLDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VTLDevice] (val x: Self) extends AnyVal {
    
    inline def setDeviceiSCSIAttributes(value: DeviceiSCSIAttributes): Self = StObject.set(x, "DeviceiSCSIAttributes", value.asInstanceOf[js.Any])
    
    inline def setDeviceiSCSIAttributesUndefined: Self = StObject.set(x, "DeviceiSCSIAttributes", js.undefined)
    
    inline def setVTLDeviceARN(value: VTLDeviceARN): Self = StObject.set(x, "VTLDeviceARN", value.asInstanceOf[js.Any])
    
    inline def setVTLDeviceARNUndefined: Self = StObject.set(x, "VTLDeviceARN", js.undefined)
    
    inline def setVTLDeviceProductIdentifier(value: VTLDeviceProductIdentifier): Self = StObject.set(x, "VTLDeviceProductIdentifier", value.asInstanceOf[js.Any])
    
    inline def setVTLDeviceProductIdentifierUndefined: Self = StObject.set(x, "VTLDeviceProductIdentifier", js.undefined)
    
    inline def setVTLDeviceType(value: VTLDeviceType): Self = StObject.set(x, "VTLDeviceType", value.asInstanceOf[js.Any])
    
    inline def setVTLDeviceTypeUndefined: Self = StObject.set(x, "VTLDeviceType", js.undefined)
    
    inline def setVTLDeviceVendor(value: VTLDeviceVendor): Self = StObject.set(x, "VTLDeviceVendor", value.asInstanceOf[js.Any])
    
    inline def setVTLDeviceVendorUndefined: Self = StObject.set(x, "VTLDeviceVendor", js.undefined)
  }
}
