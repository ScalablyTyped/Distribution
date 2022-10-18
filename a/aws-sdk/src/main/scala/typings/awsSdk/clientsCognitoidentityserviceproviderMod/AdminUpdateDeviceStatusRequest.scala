package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminUpdateDeviceStatusRequest extends StObject {
  
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType
  
  /**
    * The status indicating whether a device has been remembered or not.
    */
  var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.undefined
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The user name.
    */
  var Username: UsernameType
}
object AdminUpdateDeviceStatusRequest {
  
  inline def apply(DeviceKey: DeviceKeyType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminUpdateDeviceStatusRequest = {
    val __obj = js.Dynamic.literal(DeviceKey = DeviceKey.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminUpdateDeviceStatusRequest]
  }
  
  extension [Self <: AdminUpdateDeviceStatusRequest](x: Self) {
    
    inline def setDeviceKey(value: DeviceKeyType): Self = StObject.set(x, "DeviceKey", value.asInstanceOf[js.Any])
    
    inline def setDeviceRememberedStatus(value: DeviceRememberedStatusType): Self = StObject.set(x, "DeviceRememberedStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceRememberedStatusUndefined: Self = StObject.set(x, "DeviceRememberedStatus", js.undefined)
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
