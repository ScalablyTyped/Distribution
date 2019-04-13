package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUICustomizationRequest extends js.Object {
  /**
    * The client ID for the client app.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}

object GetUICustomizationRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, ClientId: ClientIdType = null): GetUICustomizationRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId)
    __obj.asInstanceOf[GetUICustomizationRequest]
  }
}

