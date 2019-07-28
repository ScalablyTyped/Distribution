package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSigningCertificateRequest extends js.Object {
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}

object GetSigningCertificateRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): GetSigningCertificateRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[GetSigningCertificateRequest]
  }
}

