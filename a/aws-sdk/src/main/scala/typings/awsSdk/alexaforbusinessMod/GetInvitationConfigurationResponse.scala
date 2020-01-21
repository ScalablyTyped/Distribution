package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInvitationConfigurationResponse extends js.Object {
  /**
    * The email ID of the organization or individual contact that the enrolled user can use. 
    */
  var ContactEmail: js.UndefOr[Email] = js.native
  /**
    * The name of the organization sending the enrollment invite to a user.
    */
  var OrganizationName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.OrganizationName] = js.native
  /**
    * The list of private skill IDs that you want to recommend to the user to enable in the invitation.
    */
  var PrivateSkillIds: js.UndefOr[ShortSkillIdList] = js.native
}

object GetInvitationConfigurationResponse {
  @scala.inline
  def apply(
    ContactEmail: Email = null,
    OrganizationName: OrganizationName = null,
    PrivateSkillIds: ShortSkillIdList = null
  ): GetInvitationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (ContactEmail != null) __obj.updateDynamic("ContactEmail")(ContactEmail.asInstanceOf[js.Any])
    if (OrganizationName != null) __obj.updateDynamic("OrganizationName")(OrganizationName.asInstanceOf[js.Any])
    if (PrivateSkillIds != null) __obj.updateDynamic("PrivateSkillIds")(PrivateSkillIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInvitationConfigurationResponse]
  }
}

