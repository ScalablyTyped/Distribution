package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSearchSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The directory identifier of the user.
    */
  var DirectoryUserId: js.UndefOr[typings.awsSdk.clientsConnectMod.DirectoryUserId] = js.undefined
  
  /**
    * The identifier of the user's hierarchy group.
    */
  var HierarchyGroupId: js.UndefOr[typings.awsSdk.clientsConnectMod.HierarchyGroupId] = js.undefined
  
  /**
    * The identifier of the user's summary.
    */
  var Id: js.UndefOr[UserId] = js.undefined
  
  /**
    * The user's first name and last name.
    */
  var IdentityInfo: js.UndefOr[UserIdentityInfoLite] = js.undefined
  
  var PhoneConfig: js.UndefOr[UserPhoneConfig] = js.undefined
  
  /**
    * The identifier of the user's routing profile.
    */
  var RoutingProfileId: js.UndefOr[typings.awsSdk.clientsConnectMod.RoutingProfileId] = js.undefined
  
  /**
    * The identifiers of the user's security profiles.
    */
  var SecurityProfileIds: js.UndefOr[typings.awsSdk.clientsConnectMod.SecurityProfileIds] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The name of the user.
    */
  var Username: js.UndefOr[AgentUsername] = js.undefined
}
object UserSearchSummary {
  
  inline def apply(): UserSearchSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSearchSummary]
  }
  
  extension [Self <: UserSearchSummary](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDirectoryUserId(value: DirectoryUserId): Self = StObject.set(x, "DirectoryUserId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryUserIdUndefined: Self = StObject.set(x, "DirectoryUserId", js.undefined)
    
    inline def setHierarchyGroupId(value: HierarchyGroupId): Self = StObject.set(x, "HierarchyGroupId", value.asInstanceOf[js.Any])
    
    inline def setHierarchyGroupIdUndefined: Self = StObject.set(x, "HierarchyGroupId", js.undefined)
    
    inline def setId(value: UserId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIdentityInfo(value: UserIdentityInfoLite): Self = StObject.set(x, "IdentityInfo", value.asInstanceOf[js.Any])
    
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
