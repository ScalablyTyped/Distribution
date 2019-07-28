package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIdentityProviderRequest extends js.Object {
  /**
    * The identity provider name.
    */
  var ProviderName: ProviderNameType
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}

object DescribeIdentityProviderRequest {
  @scala.inline
  def apply(ProviderName: ProviderNameType, UserPoolId: UserPoolIdType): DescribeIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderName = ProviderName, UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[DescribeIdentityProviderRequest]
  }
}

