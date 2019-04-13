package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetUserSettingsRequest extends js.Object {
  /**
    * The access token for the set user settings request.
    */
  var AccessToken: TokenModelType
  /**
    * Specifies the options for MFA (e.g., email or phone number).
    */
  var MFAOptions: MFAOptionListType
}

object SetUserSettingsRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType, MFAOptions: MFAOptionListType): SetUserSettingsRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken, MFAOptions = MFAOptions)
  
    __obj.asInstanceOf[SetUserSettingsRequest]
  }
}

