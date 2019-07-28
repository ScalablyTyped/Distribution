package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminDeleteUserAttributesRequest extends js.Object {
  /**
    * An array of strings representing the user attribute names you wish to delete. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributeNames: AttributeNameListType
  /**
    * The user pool ID for the user pool where you want to delete user attributes.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user name of the user from which you would like to delete attributes.
    */
  var Username: UsernameType
}

object AdminDeleteUserAttributesRequest {
  @scala.inline
  def apply(UserAttributeNames: AttributeNameListType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminDeleteUserAttributesRequest = {
    val __obj = js.Dynamic.literal(UserAttributeNames = UserAttributeNames, UserPoolId = UserPoolId, Username = Username)
  
    __obj.asInstanceOf[AdminDeleteUserAttributesRequest]
  }
}

