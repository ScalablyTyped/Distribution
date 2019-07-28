package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInvitationConfigurationResponse extends js.Object {
  /**
    * The email ID of the organization or individual contact that the enrolled user can use. 
    */
  var ContactEmail: js.UndefOr[Email] = js.undefined
  /**
    * The name of the organization sending the enrollment invite to a user.
    */
  var OrganizationName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.OrganizationName] = js.undefined
  /**
    * The list of private skill IDs that you want to recommend to the user to enable in the invitation.
    */
  var PrivateSkillIds: js.UndefOr[ShortSkillIdList] = js.undefined
}

object GetInvitationConfigurationResponse {
  @scala.inline
  def apply(
    ContactEmail: Email = null,
    OrganizationName: OrganizationName = null,
    PrivateSkillIds: ShortSkillIdList = null
  ): GetInvitationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (ContactEmail != null) __obj.updateDynamic("ContactEmail")(ContactEmail)
    if (OrganizationName != null) __obj.updateDynamic("OrganizationName")(OrganizationName)
    if (PrivateSkillIds != null) __obj.updateDynamic("PrivateSkillIds")(PrivateSkillIds)
    __obj.asInstanceOf[GetInvitationConfigurationResponse]
  }
}

