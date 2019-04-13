package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminSetUserSettingsRequest extends js.Object {
  /**
    * Specifies the options for MFA (e.g., email or phone number).
    */
  var MFAOptions: MFAOptionListType
  /**
    * The user pool ID for the user pool where you want to set the user's settings, such as MFA options.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user name of the user for whom you wish to set user settings.
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

