package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationalUnit extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of this OU. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[OrganizationalUnitArn] = js.undefined
  /**
    * The unique identifier (ID) associated with this OU. The regex pattern for an organizational unit ID string requires "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.
    */
  var Id: js.UndefOr[OrganizationalUnitId] = js.undefined
  /**
    * The friendly name of this OU. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[OrganizationalUnitName] = js.undefined
}

object OrganizationalUnit {
  @scala.inline
  def apply(
    Arn: OrganizationalUnitArn = null,
    Id: OrganizationalUnitId = null,
    Name: OrganizationalUnitName = null
  ): OrganizationalUnit = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[OrganizationalUnit]
  }
}

