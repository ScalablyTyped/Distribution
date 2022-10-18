package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpnConnectionDeviceSampleConfigurationResult extends StObject {
  
  /**
    * Sample configuration file for the specified customer gateway device.
    */
  var VpnConnectionDeviceSampleConfiguration: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpnConnectionDeviceSampleConfiguration] = js.undefined
}
object GetVpnConnectionDeviceSampleConfigurationResult {
  
  inline def apply(): GetVpnConnectionDeviceSampleConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpnConnectionDeviceSampleConfigurationResult]
  }
  
  extension [Self <: GetVpnConnectionDeviceSampleConfigurationResult](x: Self) {
    
    inline def setVpnConnectionDeviceSampleConfiguration(value: VpnConnectionDeviceSampleConfiguration): Self = StObject.set(x, "VpnConnectionDeviceSampleConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionDeviceSampleConfigurationUndefined: Self = StObject.set(x, "VpnConnectionDeviceSampleConfiguration", js.undefined)
  }
}
