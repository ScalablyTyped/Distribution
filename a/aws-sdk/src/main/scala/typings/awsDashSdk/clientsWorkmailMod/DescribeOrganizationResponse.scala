package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationResponse extends js.Object {
  /**
    * The alias for an organization.
    */
  var Alias: js.UndefOr[OrganizationName] = js.native
  /**
    * The date at which the organization became usable in the WorkMail context, in UNIX epoch time format.
    */
  var CompletedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The default mail domain associated with the organization.
    */
  var DefaultMailDomain: js.UndefOr[String] = js.native
  /**
    * The identifier for the directory associated with an Amazon WorkMail organization.
    */
  var DirectoryId: js.UndefOr[String] = js.native
  /**
    * The type of directory associated with the WorkMail organization.
    */
  var DirectoryType: js.UndefOr[String] = js.native
  /**
    * (Optional) The error message indicating if unexpected behavior was encountered with regards to the organization.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The identifier of an organization.
    */
  var OrganizationId: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.OrganizationId] = js.native
  /**
    * The state of an organization.
    */
  var State: js.UndefOr[String] = js.native
}

object DescribeOrganizationResponse {
  @scala.inline
  def apply(
    Alias: OrganizationName = null,
    CompletedDate: Timestamp = null,
    DefaultMailDomain: String = null,
    DirectoryId: String = null,
    DirectoryType: String = null,
    ErrorMessage: String = null,
    OrganizationId: OrganizationId = null,
    State: String = null
  ): DescribeOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (Alias != null) __obj.updateDynamic("Alias")(Alias.asInstanceOf[js.Any])
    if (CompletedDate != null) __obj.updateDynamic("CompletedDate")(CompletedDate.asInstanceOf[js.Any])
    if (DefaultMailDomain != null) __obj.updateDynamic("DefaultMailDomain")(DefaultMailDomain.asInstanceOf[js.Any])
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (DirectoryType != null) __obj.updateDynamic("DirectoryType")(DirectoryType.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationResponse]
  }
}

