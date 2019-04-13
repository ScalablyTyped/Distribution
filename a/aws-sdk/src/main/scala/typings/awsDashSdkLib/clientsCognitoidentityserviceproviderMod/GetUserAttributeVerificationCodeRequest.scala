package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserAttributeVerificationCodeRequest extends js.Object {
  /**
    * The access token returned by the server response to get the user attribute verification code.
    */
  var AccessToken: TokenModelType
  /**
    * The attribute name returned by the server response to get the user attribute verification code.
    */
  var AttributeName: AttributeNameType
}

object GetUserAttributeVerificationCodeRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType, AttributeName: AttributeNameType): GetUserAttributeVerificationCodeRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken, AttributeName = AttributeName)
  
    __obj.asInstanceOf[GetUserAttributeVerificationCodeRequest]
  }
}

