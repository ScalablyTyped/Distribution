package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutInvitationConfigurationRequest extends StObject {
  
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
  implicit class PutInvitationConfigurationRequestMutableBuilder[Self <: PutInvitationConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactEmail(value: Email): Self = StObject.set(x, "ContactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactEmailUndefined: Self = StObject.set(x, "ContactEmail", js.undefined)
    
    @scala.inline
    def setOrganizationName(value: OrganizationName): Self = StObject.set(x, "OrganizationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateSkillIds(value: ShortSkillIdList): Self = StObject.set(x, "PrivateSkillIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateSkillIdsUndefined: Self = StObject.set(x, "PrivateSkillIds", js.undefined)
    
    @scala.inline
    def setPrivateSkillIdsVarargs(value: SkillId*): Self = StObject.set(x, "PrivateSkillIds", js.Array(value :_*))
  }
}
