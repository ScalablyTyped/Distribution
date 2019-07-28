package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGroupRequest extends js.Object {
  /**
    * A string containing the new description of the group.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  /**
    * The name of the group.
    */
  var GroupName: GroupNameType
  /**
    * The new precedence value for the group. For more information about this parameter, see .
    */
  var Precedence: js.UndefOr[PrecedenceType] = js.undefined
  /**
    * The new role ARN for the group. This is used for setting the cognito:roles and cognito:preferred_role claims in the token.
    */
  var RoleArn: js.UndefOr[ArnType] = js.undefined
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}

object UpdateGroupRequest {
  @scala.inline
  def apply(
    GroupName: GroupNameType,
    UserPoolId: UserPoolIdType,
    Description: DescriptionType = null,
    Precedence: js.UndefOr[PrecedenceType] = js.undefined,
    RoleArn: ArnType = null
  ): UpdateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName, UserPoolId = UserPoolId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(Precedence)) __obj.updateDynamic("Precedence")(Precedence)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    __obj.asInstanceOf[UpdateGroupRequest]
  }
}

