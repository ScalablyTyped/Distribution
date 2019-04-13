package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutInvitationConfigurationRequest extends js.Object {
  /**
    * The email ID of the organization or individual contact that the enrolled user can use. 
    */
  var ContactEmail: js.UndefOr[Email] = js.undefined
  /**
    * The name of the organization sending the enrollment invite to a user.
    */
  var OrganizationName: awsDashSdkLib.clientsAlexaforbusinessMod.OrganizationName
  /**
    * The list of private skill IDs that you want to recommend to the user to enable in the invitation.
    */
  var PrivateSkillIds: js.UndefOr[ShortSkillIdList] = js.undefined
}

object PutInvitationConfigurationRequest {
  @scala.inline
  def apply(
    OrganizationName: OrganizationName,
    ContactEmail: Email = null,
    PrivateSkillIds: ShortSkillIdList = null
  ): PutInvitationConfigurationRequest = {
    val __obj = js.Dynamic.literal(OrganizationName = OrganizationName)
    if (ContactEmail != null) __obj.updateDynamic("ContactEmail")(ContactEmail)
    if (PrivateSkillIds != null) __obj.updateDynamic("PrivateSkillIds")(PrivateSkillIds)
    __obj.asInstanceOf[PutInvitationConfigurationRequest]
  }
}

