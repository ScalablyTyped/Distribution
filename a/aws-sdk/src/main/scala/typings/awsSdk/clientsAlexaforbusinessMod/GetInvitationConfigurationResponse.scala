package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInvitationConfigurationResponse extends StObject {
  
  /**
    * The email ID of the organization or individual contact that the enrolled user can use. 
    */
  var ContactEmail: js.UndefOr[Email] = js.undefined
  
  /**
    * The name of the organization sending the enrollment invite to a user.
    */
  var OrganizationName: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.OrganizationName] = js.undefined
  
  /**
    * The list of private skill IDs that you want to recommend to the user to enable in the invitation.
    */
  var PrivateSkillIds: js.UndefOr[ShortSkillIdList] = js.undefined
}
object GetInvitationConfigurationResponse {
  
  inline def apply(): GetInvitationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInvitationConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInvitationConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setContactEmail(value: Email): Self = StObject.set(x, "ContactEmail", value.asInstanceOf[js.Any])
    
    inline def setContactEmailUndefined: Self = StObject.set(x, "ContactEmail", js.undefined)
    
    inline def setOrganizationName(value: OrganizationName): Self = StObject.set(x, "OrganizationName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNameUndefined: Self = StObject.set(x, "OrganizationName", js.undefined)
    
    inline def setPrivateSkillIds(value: ShortSkillIdList): Self = StObject.set(x, "PrivateSkillIds", value.asInstanceOf[js.Any])
    
    inline def setPrivateSkillIdsUndefined: Self = StObject.set(x, "PrivateSkillIds", js.undefined)
    
    inline def setPrivateSkillIdsVarargs(value: SkillId*): Self = StObject.set(x, "PrivateSkillIds", js.Array(value*))
  }
}
