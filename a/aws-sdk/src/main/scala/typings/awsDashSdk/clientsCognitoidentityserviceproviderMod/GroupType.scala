package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupType extends js.Object {
  /**
    * The date the group was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  /**
    * A string containing the description of the group.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  /**
    * The name of the group.
    */
  var GroupName: js.UndefOr[GroupNameType] = js.undefined
  /**
    * The date the group was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * A nonnegative integer value that specifies the precedence of this group relative to the other groups that a user can belong to in the user pool. If a user belongs to two or more groups, it is the group with the highest precedence whose role ARN will be used in the cognito:roles and cognito:preferred_role claims in the user's tokens. Groups with higher Precedence values take precedence over groups with lower Precedence values or with null Precedence values. Two groups can have the same Precedence value. If this happens, neither group takes precedence over the other. If two groups with the same Precedence have the same role ARN, that role is used in the cognito:preferred_role claim in tokens for users in each group. If the two groups have different role ARNs, the cognito:preferred_role claim is not set in users' tokens. The default Precedence value is null.
    */
  var Precedence: js.UndefOr[PrecedenceType] = js.undefined
  /**
    * The role ARN for the group.
    */
  var RoleArn: js.UndefOr[ArnType] = js.undefined
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
}

object GroupType {
  @scala.inline
  def apply(
    CreationDate: DateType = null,
    Description: DescriptionType = null,
    GroupName: GroupNameType = null,
    LastModifiedDate: DateType = null,
    Precedence: js.UndefOr[PrecedenceType] = js.undefined,
    RoleArn: ArnType = null,
    UserPoolId: UserPoolIdType = null
  ): GroupType = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (!js.isUndefined(Precedence)) __obj.updateDynamic("Precedence")(Precedence)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId)
    __obj.asInstanceOf[GroupType]
  }
}

