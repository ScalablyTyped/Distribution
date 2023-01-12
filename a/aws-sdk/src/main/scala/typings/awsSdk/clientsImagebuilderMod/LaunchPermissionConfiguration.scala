package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchPermissionConfiguration extends StObject {
  
  /**
    * The ARN for an Amazon Web Services Organization that you want to share your AMI with. For more information, see What is Organizations?.
    */
  var organizationArns: js.UndefOr[OrganizationArnList] = js.undefined
  
  /**
    * The ARN for an Organizations organizational unit (OU) that you want to share your AMI with. For more information about key concepts for Organizations, see Organizations terminology and concepts.
    */
  var organizationalUnitArns: js.UndefOr[OrganizationalUnitArnList] = js.undefined
  
  /**
    * The name of the group.
    */
  var userGroups: js.UndefOr[StringList] = js.undefined
  
  /**
    * The Amazon Web Services account ID.
    */
  var userIds: js.UndefOr[AccountList] = js.undefined
}
object LaunchPermissionConfiguration {
  
  inline def apply(): LaunchPermissionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPermissionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchPermissionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setOrganizationArns(value: OrganizationArnList): Self = StObject.set(x, "organizationArns", value.asInstanceOf[js.Any])
    
    inline def setOrganizationArnsUndefined: Self = StObject.set(x, "organizationArns", js.undefined)
    
    inline def setOrganizationArnsVarargs(value: OrganizationArn*): Self = StObject.set(x, "organizationArns", js.Array(value*))
    
    inline def setOrganizationalUnitArns(value: OrganizationalUnitArnList): Self = StObject.set(x, "organizationalUnitArns", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitArnsUndefined: Self = StObject.set(x, "organizationalUnitArns", js.undefined)
    
    inline def setOrganizationalUnitArnsVarargs(value: OrganizationalUnitArn*): Self = StObject.set(x, "organizationalUnitArns", js.Array(value*))
    
    inline def setUserGroups(value: StringList): Self = StObject.set(x, "userGroups", value.asInstanceOf[js.Any])
    
    inline def setUserGroupsUndefined: Self = StObject.set(x, "userGroups", js.undefined)
    
    inline def setUserGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "userGroups", js.Array(value*))
    
    inline def setUserIds(value: AccountList): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
    
    inline def setUserIdsUndefined: Self = StObject.set(x, "userIds", js.undefined)
    
    inline def setUserIdsVarargs(value: AccountId*): Self = StObject.set(x, "userIds", js.Array(value*))
  }
}
