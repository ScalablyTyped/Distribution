package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the policy target. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[GenericArn] = js.native
  /**
    * The friendly name of the policy target. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[TargetName] = js.native
  /**
    * The unique identifier (ID) of the policy target. The regex pattern for a target ID string requires one of the following:   Root: A string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Account: A string that consists of exactly 12 digits.   Organizational unit (OU): A string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
    */
  var TargetId: js.UndefOr[PolicyTargetId] = js.native
  /**
    * The type of the policy target.
    */
  var Type: js.UndefOr[TargetType] = js.native
}

object PolicyTargetSummary {
  @scala.inline
  def apply(
    Arn: GenericArn = null,
    Name: TargetName = null,
    TargetId: PolicyTargetId = null,
    Type: TargetType = null
  ): PolicyTargetSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (TargetId != null) __obj.updateDynamic("TargetId")(TargetId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyTargetSummary]
  }
}

