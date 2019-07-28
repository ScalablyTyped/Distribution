package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupRequest extends js.Object {
  /**
    * A string containing the description of the group.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  /**
    * The name of the group. Must be unique.
    */
  var GroupName: GroupNameType
  /**
    * A nonnegative integer value that specifies the precedence of this group relative to the other groups that a user can belong to in the user pool. Zero is the highest precedence value. Groups with lower Precedence values take precedence over groups with higher or null Precedence values. If a user belongs to two or more groups, it is the group with the lowest precedence value whose role ARN will be used in the cognito:roles and cognito:preferred_role claims in the user's tokens. Two groups can have the same Precedence value. If this happens, neither group takes precedence over the other. If two groups with the same Precedence have the same role ARN, that role is used in the cognito:preferred_role claim in tokens for users in each group. If the two groups have different role ARNs, the cognito:preferred_role claim is not set in users' tokens. The default Precedence value is null.
    */
  var Precedence: js.UndefOr[PrecedenceType] = js.undefined
  /**
    * The role ARN for the group.
    */
  var RoleArn: js.UndefOr[ArnType] = js.undefined
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}

object CreateGroupRequest {
  @scala.inline
  def apply(
    GroupName: GroupNameType,
    UserPoolId: UserPoolIdType,
    Description: DescriptionType = null,
    Precedence: js.UndefOr[PrecedenceType] = js.undefined,
    RoleArn: ArnType = null
  ): CreateGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName, UserPoolId = UserPoolId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(Precedence)) __obj.updateDynamic("Precedence")(Precedence)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    __obj.asInstanceOf[CreateGroupRequest]
  }
}

