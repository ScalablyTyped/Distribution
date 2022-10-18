package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user account.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the user account in the directory used for identity management.
    */
  var DirectoryUserId: js.UndefOr[typings.awsSdk.clientsConnectMod.DirectoryUserId] = js.undefined
  
  /**
    * The identifier of the hierarchy group for the user.
    */
  var HierarchyGroupId: js.UndefOr[typings.awsSdk.clientsConnectMod.HierarchyGroupId] = js.undefined
  
  /**
    * The identifier of the user account.
    */
  var Id: js.UndefOr[UserId] = js.undefined
  
  /**
    * Information about the user identity.
    */
  var IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined
  
  /**
    * Information about the phone configuration for the user.
    */
  var PhoneConfig: js.UndefOr[UserPhoneConfig] = js.undefined
  
  /**
    * The identifier of the routing profile for the user.
    */
  var RoutingProfileId: js.UndefOr[typings.awsSdk.clientsConnectMod.RoutingProfileId] = js.undefined
  
  /**
    * The identifiers of the security profiles for the user.
    */
  var SecurityProfileIds: js.UndefOr[typings.awsSdk.clientsConnectMod.SecurityProfileIds] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The user name assigned to the user account.
    */
  var Username: js.UndefOr[AgentUsername] = js.undefined
}
object User {
  
  inline def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDirectoryUserId(value: DirectoryUserId): Self = StObject.set(x, "DirectoryUserId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryUserIdUndefined: Self = StObject.set(x, "DirectoryUserId", js.undefined)
    
    inline def setHierarchyGroupId(value: HierarchyGroupId): Self = StObject.set(x, "HierarchyGroupId", value.asInstanceOf[js.Any])
    
    inline def setHierarchyGroupIdUndefined: Self = StObject.set(x, "HierarchyGroupId", js.undefined)
    
    inline def setId(value: UserId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIdentityInfo(value: UserIdentityInfo): Self = StObject.set(x, "IdentityInfo", value.asInstanceOf[js.Any])
    
    inline def setIdentityInfoUndefined: Self = StObject.set(x, "IdentityInfo", js.undefined)
    
    inline def setPhoneConfig(value: UserPhoneConfig): Self = StObject.set(x, "PhoneConfig", value.asInstanceOf[js.Any])
    
    inline def setPhoneConfigUndefined: Self = StObject.set(x, "PhoneConfig", js.undefined)
    
    inline def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
    
    inline def setRoutingProfileIdUndefined: Self = StObject.set(x, "RoutingProfileId", js.undefined)
    
    inline def setSecurityProfileIds(value: SecurityProfileIds): Self = StObject.set(x, "SecurityProfileIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileIdsUndefined: Self = StObject.set(x, "SecurityProfileIds", js.undefined)
    
    inline def setSecurityProfileIdsVarargs(value: SecurityProfileId*): Self = StObject.set(x, "SecurityProfileIds", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUsername(value: AgentUsername): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
