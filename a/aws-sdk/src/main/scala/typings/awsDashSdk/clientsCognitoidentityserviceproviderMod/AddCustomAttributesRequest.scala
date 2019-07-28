package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCustomAttributesRequest extends js.Object {
  /**
    * An array of custom attributes, such as Mutable and Name.
    */
  var CustomAttributes: CustomAttributesListType
  /**
    * The user pool ID for the user pool where you want to add custom attributes.
    */
  var UserPoolId: UserPoolIdType
}

object AddCustomAttributesRequest {
  @scala.inline
  def apply(CustomAttributes: CustomAttributesListType, UserPoolId: UserPoolIdType): AddCustomAttributesRequest = {
    val __obj = js.Dynamic.literal(CustomAttributes = CustomAttributes, UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[AddCustomAttributesRequest]
  }
}

