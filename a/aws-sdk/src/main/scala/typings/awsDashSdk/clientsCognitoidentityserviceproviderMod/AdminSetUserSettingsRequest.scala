package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminSetUserSettingsRequest extends js.Object {
  /**
    * You can use this parameter only to set an SMS configuration that uses SMS for delivery.
    */
  var MFAOptions: MFAOptionListType
  /**
    * The ID of the user pool that contains the user that you are setting options for.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user name of the user that you are setting options for.
    */
  var Username: UsernameType
}

object AdminSetUserSettingsRequest {
  @scala.inline
  def apply(MFAOptions: MFAOptionListType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminSetUserSettingsRequest = {
    val __obj = js.Dynamic.literal(MFAOptions = MFAOptions, UserPoolId = UserPoolId, Username = Username)
  
    __obj.asInstanceOf[AdminSetUserSettingsRequest]
  }
}

