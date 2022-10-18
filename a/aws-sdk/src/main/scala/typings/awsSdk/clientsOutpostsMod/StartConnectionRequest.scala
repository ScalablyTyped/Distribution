package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartConnectionRequest extends StObject {
  
  /**
    *  The ID of the Outpost server. 
    */
  var AssetId: typings.awsSdk.clientsOutpostsMod.AssetId
  
  /**
    *  The public key of the client. 
    */
  var ClientPublicKey: WireGuardPublicKey
  
  /**
    *  The serial number of the dongle. 
    */
  var DeviceSerialNumber: typings.awsSdk.clientsOutpostsMod.DeviceSerialNumber
  
  /**
    *  The device index of the network interface on the Outpost server. 
    */
  var NetworkInterfaceDeviceIndex: typings.awsSdk.clientsOutpostsMod.NetworkInterfaceDeviceIndex
}
object StartConnectionRequest {
  
  inline def apply(
    AssetId: AssetId,
    ClientPublicKey: WireGuardPublicKey,
    DeviceSerialNumber: DeviceSerialNumber,
    NetworkInterfaceDeviceIndex: NetworkInterfaceDeviceIndex
  ): StartConnectionRequest = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], ClientPublicKey = ClientPublicKey.asInstanceOf[js.Any], DeviceSerialNumber = DeviceSerialNumber.asInstanceOf[js.Any], NetworkInterfaceDeviceIndex = NetworkInterfaceDeviceIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartConnectionRequest]
  }
  
  extension [Self <: StartConnectionRequest](x: Self) {
    
    inline def setAssetId(value: AssetId): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    inline def setClientPublicKey(value: WireGuardPublicKey): Self = StObject.set(x, "ClientPublicKey", value.asInstanceOf[js.Any])
    
    inline def setDeviceSerialNumber(value: DeviceSerialNumber): Self = StObject.set(x, "DeviceSerialNumber", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceDeviceIndex(value: NetworkInterfaceDeviceIndex): Self = StObject.set(x, "NetworkInterfaceDeviceIndex", value.asInstanceOf[js.Any])
  }
}
