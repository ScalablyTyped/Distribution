package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnConnectionDeviceType extends StObject {
  
  /**
    * Customer gateway device platform.
    */
  var Platform: js.UndefOr[String] = js.undefined
  
  /**
    * Customer gateway device software version.
    */
  var Software: js.UndefOr[String] = js.undefined
  
  /**
    * Customer gateway device vendor.
    */
  var Vendor: js.UndefOr[String] = js.undefined
  
  /**
    * Customer gateway device identifier.
    */
  var VpnConnectionDeviceTypeId: js.UndefOr[String] = js.undefined
}
object VpnConnectionDeviceType {
  
  inline def apply(): VpnConnectionDeviceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionDeviceType]
  }
  
  extension [Self <: VpnConnectionDeviceType](x: Self) {
    
    inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setSoftware(value: String): Self = StObject.set(x, "Software", value.asInstanceOf[js.Any])
    
    inline def setSoftwareUndefined: Self = StObject.set(x, "Software", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "Vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "Vendor", js.undefined)
    
    inline def setVpnConnectionDeviceTypeId(value: String): Self = StObject.set(x, "VpnConnectionDeviceTypeId", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionDeviceTypeIdUndefined: Self = StObject.set(x, "VpnConnectionDeviceTypeId", js.undefined)
  }
}
