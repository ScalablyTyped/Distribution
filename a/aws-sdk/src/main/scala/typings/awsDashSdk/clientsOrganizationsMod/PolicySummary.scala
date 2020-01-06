package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicySummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the policy. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[PolicyArn] = js.native
  /**
    * A Boolean value that indicates whether the specified policy is an AWS managed policy. If true, then you can attach the policy to roots, OUs, or accounts, but you cannot edit it.
    */
  var AwsManaged: js.UndefOr[AwsManagedPolicy] = js.native
  /**
    * The description of the policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.native
  /**
    * The unique identifier (ID) of the policy. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lower-case letters or digits.
    */
  var Id: js.UndefOr[PolicyId] = js.native
  /**
    * The friendly name of the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[PolicyName] = js.native
  /**
    * The type of policy.
    */
  var Type: js.UndefOr[PolicyType] = js.native
}

object PolicySummary {
  @scala.inline
  def apply(
    Arn: PolicyArn = null,
    AwsManaged: js.UndefOr[Boolean] = js.undefined,
    Description: PolicyDescription = null,
    Id: PolicyId = null,
    Name: PolicyName = null,
    Type: PolicyType = null
  ): PolicySummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (!js.isUndefined(AwsManaged)) __obj.updateDynamic("AwsManaged")(AwsManaged.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicySummary]
  }
}

