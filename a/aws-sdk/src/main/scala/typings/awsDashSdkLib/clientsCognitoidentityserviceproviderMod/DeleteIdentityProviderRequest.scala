package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIdentityProviderRequest extends js.Object {
  /**
    * The identity provider name.
    */
  var ProviderName: ProviderNameType
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}

object DeleteIdentityProviderRequest {
  @scala.inline
  def apply(ProviderName: ProviderNameType, UserPoolId: UserPoolIdType): DeleteIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderName = ProviderName, UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[DeleteIdentityProviderRequest]
  }
}

