package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserPoolDomainRequest extends js.Object {
  /**
    * The domain string.
    */
  var Domain: DomainType = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object DeleteUserPoolDomainRequest {
  @scala.inline
  def apply(Domain: DomainType, UserPoolId: UserPoolIdType): DeleteUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUserPoolDomainRequest]
  }
}

