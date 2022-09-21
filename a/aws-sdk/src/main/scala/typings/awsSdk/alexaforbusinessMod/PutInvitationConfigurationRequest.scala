package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutInvitationConfigurationRequest extends StObject {
  
  /**
    * The email ID of the organization or individual contact that the enrolled user can use. 
    */
  var ContactEmail: js.UndefOr[Email] = js.undefined
  
  /**
    * The name of the organization sending the enrollment invite to a user.
    */
  var OrganizationName: typings.awsSdk.alexaforbusinessMod.OrganizationName
  
  /**
    * The list of private skill IDs that you want to recommend to the user to enable in the invitation.
    */
  var PrivateSkillIds: js.UndefOr[ShortSkillIdList] = js.undefined
}
object PutInvitationConfigurationRequest {
  
  inline def apply(OrganizationName: OrganizationName): PutInvitationConfigurationRequest = {
    val __obj = js.Dynamic.literal(OrganizationName = OrganizationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInvitationConfigurationRequest]
  }
  
  extension [Self <: PutInvitationConfigurationRequest](x: Self) {
    
    inline def setContactEmail(value: Email): Self = StObject.set(x, "ContactEmail", value.asInstanceOf[js.Any])
    
    inline def setContactEmailUndefined: Self = StObject.set(x, "ContactEmail", js.undefined)
    
    inline def setOrganizationName(value: OrganizationName): Self = StObject.set(x, "OrganizationName", value.asInstanceOf[js.Any])
    
    inline def setPrivateSkillIds(value: ShortSkillIdList): Self = StObject.set(x, "PrivateSkillIds", value.asInstanceOf[js.Any])
    
    inline def setPrivateSkillIdsUndefined: Self = StObject.set(x, "PrivateSkillIds", js.undefined)
    
    inline def setPrivateSkillIdsVarargs(value: SkillId*): Self = StObject.set(x, "PrivateSkillIds", js.Array(value*))
  }
}
