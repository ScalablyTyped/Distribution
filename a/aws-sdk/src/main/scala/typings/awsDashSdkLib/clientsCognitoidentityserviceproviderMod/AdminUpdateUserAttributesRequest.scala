package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminUpdateUserAttributesRequest extends js.Object {
  /**
    * An array of name-value pairs representing user attributes. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributes: AttributeListType
  /**
    * The user pool ID for the user pool where you want to update user attributes.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user name of the user for whom you want to update user attributes.
    */
  var Username: UsernameType
}

object AdminUpdateUserAttributesRequest {
  @scala.inline
  def apply(UserAttributes: AttributeListType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminUpdateUserAttributesRequest = {
    val __obj = js.Dynamic.literal(UserAttributes = UserAttributes, UserPoolId = UserPoolId, Username = Username)
  
    __obj.asInstanceOf[AdminUpdateUserAttributesRequest]
  }
}

