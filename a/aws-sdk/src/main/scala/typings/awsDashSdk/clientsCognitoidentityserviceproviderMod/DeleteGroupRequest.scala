package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGroupRequest extends js.Object {
  /**
    * The name of the group.
    */
  var GroupName: GroupNameType
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}

object DeleteGroupRequest {
  @scala.inline
  def apply(GroupName: GroupNameType, UserPoolId: UserPoolIdType): DeleteGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName, UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[DeleteGroupRequest]
  }
}

