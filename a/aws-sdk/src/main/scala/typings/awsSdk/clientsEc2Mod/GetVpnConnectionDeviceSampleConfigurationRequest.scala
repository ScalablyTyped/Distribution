package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVpnConnectionDeviceSampleConfigurationRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IKE version to be used in the sample configuration file for your customer gateway device. You can specify one of the following versions: ikev1 or ikev2.
    */
  var InternetKeyExchangeVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Device identifier provided by the GetVpnConnectionDeviceTypes API.
    */
  var VpnConnectionDeviceTypeId: typings.awsSdk.clientsEc2Mod.VpnConnectionDeviceTypeId
  
  /**
    * The VpnConnectionId specifies the Site-to-Site VPN connection used for the sample configuration.
    */
  var VpnConnectionId: typings.awsSdk.clientsEc2Mod.VpnConnectionId
}
object GetVpnConnectionDeviceSampleConfigurationRequest {
  
  inline def apply(VpnConnectionDeviceTypeId: VpnConnectionDeviceTypeId, VpnConnectionId: VpnConnectionId): GetVpnConnectionDeviceSampleConfigurationRequest = {
    val __obj = js.Dynamic.literal(VpnConnectionDeviceTypeId = VpnConnectionDeviceTypeId.asInstanceOf[js.Any], VpnConnectionId = VpnConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpnConnectionDeviceSampleConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVpnConnectionDeviceSampleConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInternetKeyExchangeVersion(value: String): Self = StObject.set(x, "InternetKeyExchangeVersion", value.asInstanceOf[js.Any])
    
    inline def setInternetKeyExchangeVersionUndefined: Self = StObject.set(x, "InternetKeyExchangeVersion", js.undefined)
    
    inline def setVpnConnectionDeviceTypeId(value: VpnConnectionDeviceTypeId): Self = StObject.set(x, "VpnConnectionDeviceTypeId", value.asInstanceOf[js.Any])
    
    inline def setVpnConnectionId(value: VpnConnectionId): Self = StObject.set(x, "VpnConnectionId", value.asInstanceOf[js.Any])
  }
}
