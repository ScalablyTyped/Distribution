package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserAttributesRequest extends js.Object {
  /**
    * The access token for the request to update user attributes.
    */
  var AccessToken: TokenModelType
  /**
    * An array of name-value pairs representing user attributes. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributes: AttributeListType
}

object UpdateUserAttributesRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType, UserAttributes: AttributeListType): UpdateUserAttributesRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken, UserAttributes = UserAttributes)
  
    __obj.asInstanceOf[UpdateUserAttributesRequest]
  }
}

