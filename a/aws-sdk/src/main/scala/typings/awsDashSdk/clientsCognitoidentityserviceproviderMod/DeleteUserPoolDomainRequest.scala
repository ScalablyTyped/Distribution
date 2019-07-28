package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserPoolDomainRequest extends js.Object {
  /**
    * The domain string.
    */
  var Domain: DomainType
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}

object DeleteUserPoolDomainRequest {
  @scala.inline
  def apply(Domain: DomainType, UserPoolId: UserPoolIdType): DeleteUserPoolDomainRequest = {
    val __obj = js.Dynamic.literal(Domain = Domain, UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[DeleteUserPoolDomainRequest]
  }
}

