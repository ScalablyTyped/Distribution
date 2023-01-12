package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeviceStatusRequest extends StObject {
  
  /**
    * A valid access token that Amazon Cognito issued to the user whose device status you want to update.
    */
  var AccessToken: TokenModelType
  
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType
  
  /**
    * The status of whether a device is remembered.
    */
  var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.undefined
}
object UpdateDeviceStatusRequest {
  
  inline def apply(AccessToken: TokenModelType, DeviceKey: DeviceKeyType): UpdateDeviceStatusRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], DeviceKey = DeviceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDeviceStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: TokenModelType): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
    
    inline def setDeviceKey(value: DeviceKeyType): Self = StObject.set(x, "DeviceKey", value.asInstanceOf[js.Any])
    
    inline def setDeviceRememberedStatus(value: DeviceRememberedStatusType): Self = StObject.set(x, "DeviceRememberedStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceRememberedStatusUndefined: Self = StObject.set(x, "DeviceRememberedStatus", js.undefined)
  }
}
