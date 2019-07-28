package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyUserAttributeRequest extends js.Object {
  /**
    * Represents the access token of the request to verify user attributes.
    */
  var AccessToken: TokenModelType
  /**
    * The attribute name in the request to verify user attributes.
    */
  var AttributeName: AttributeNameType
  /**
    * The verification code in the request to verify user attributes.
    */
  var Code: ConfirmationCodeType
}

object VerifyUserAttributeRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType, AttributeName: AttributeNameType, Code: ConfirmationCodeType): VerifyUserAttributeRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken, AttributeName = AttributeName, Code = Code)
  
    __obj.asInstanceOf[VerifyUserAttributeRequest]
  }
}

