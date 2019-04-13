package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserAttributesRequest extends js.Object {
  /**
    * The access token used in the request to delete user attributes.
    */
  var AccessToken: TokenModelType
  /**
    * An array of strings representing the user attribute names you wish to delete. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributeNames: AttributeNameListType
}

object DeleteUserAttributesRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType, UserAttributeNames: AttributeNameListType): DeleteUserAttributesRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken, UserAttributeNames = UserAttributeNames)
  
    __obj.asInstanceOf[DeleteUserAttributesRequest]
  }
}

