package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminAddUserToGroupRequest extends js.Object {
  /**
    * The group name.
    */
  var GroupName: GroupNameType
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The username for the user.
    */
  var Username: UsernameType
}

object AdminAddUserToGroupRequest {
  @scala.inline
  def apply(GroupName: GroupNameType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminAddUserToGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName, UserPoolId = UserPoolId, Username = Username)
  
    __obj.asInstanceOf[AdminAddUserToGroupRequest]
  }
}

