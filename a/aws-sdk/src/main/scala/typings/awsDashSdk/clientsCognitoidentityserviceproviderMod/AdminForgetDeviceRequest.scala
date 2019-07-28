package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminForgetDeviceRequest extends js.Object {
  /**
    * The device key.
    */
  var DeviceKey: DeviceKeyType
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user name.
    */
  var Username: UsernameType
}

object AdminForgetDeviceRequest {
  @scala.inline
  def apply(DeviceKey: DeviceKeyType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminForgetDeviceRequest = {
    val __obj = js.Dynamic.literal(DeviceKey = DeviceKey, UserPoolId = UserPoolId, Username = Username)
  
    __obj.asInstanceOf[AdminForgetDeviceRequest]
  }
}

