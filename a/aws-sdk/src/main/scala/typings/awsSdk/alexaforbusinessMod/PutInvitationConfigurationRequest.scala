package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutInvitationConfigurationRequest extends js.Object {
  
  /**
    * The email ID of the organization or individual contact that the enrolled user can use. 
    */
  var ContactEmail: js.UndefOr[Email] = js.native
  
  /**
    * The name of the organization sending the enrollment invite to a user.
    */
  var OrganizationName: typings.awsSdk.alexaforbusinessMod.OrganizationName = js.native
  
  /**
    * The list of private skill IDs that you want to recommend to the user to enable in the invitation.
    */
  var PrivateSkillIds: js.UndefOr[ShortSkillIdList] = js.native
}
object PutInvitationConfigurationRequest {
  
  @scala.inline
  def apply(OrganizationName: OrganizationName): PutInvitationConfigurationRequest = {
    val __obj = js.Dynamic.literal(OrganizationName = OrganizationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInvitationConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutInvitationConfigurationRequestOps[Self <: PutInvitationConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOrganizationName(value: OrganizationName): Self = this.set("OrganizationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactEmail(value: Email): Self = this.set("ContactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactEmail: Self = this.set("ContactEmail", js.undefined)
    
    @scala.inline
    def setPrivateSkillIdsVarargs(value: SkillId*): Self = this.set("PrivateSkillIds", js.Array(value :_*))
    
    @scala.inline
    def setPrivateSkillIds(value: ShortSkillIdList): Self = this.set("PrivateSkillIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateSkillIds: Self = this.set("PrivateSkillIds", js.undefined)
  }
}
