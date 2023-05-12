package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSecurityProfileRequest extends StObject {
  
  /**
    * The list of tags that a security profile uses to restrict access to resources in Amazon Connect.
    */
  var AllowedAccessControlTags: js.UndefOr[typings.awsSdk.clientsConnectMod.AllowedAccessControlTags] = js.undefined
  
  /**
    * The description of the security profile.
    */
  var Description: js.UndefOr[SecurityProfileDescription] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * Permissions assigned to the security profile. For a list of valid permissions, see List of security profile permissions. 
    */
  var Permissions: js.UndefOr[PermissionsList] = js.undefined
  
  /**
    * The name of the security profile.
    */
  var SecurityProfileName: CreateSecurityProfileName
  
  /**
    * The list of resources that a security profile applies tag restrictions to in Amazon Connect. Following are acceptable ResourceNames: User | SecurityProfile | Queue | RoutingProfile 
    */
  var TagRestrictedResources: js.UndefOr[TagRestrictedResourceList] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateSecurityProfileRequest {
  
  inline def apply(InstanceId: InstanceId, SecurityProfileName: CreateSecurityProfileName): CreateSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], SecurityProfileName = SecurityProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSecurityProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setAllowedAccessControlTags(value: AllowedAccessControlTags): Self = StObject.set(x, "AllowedAccessControlTags", value.asInstanceOf[js.Any])
    
    inline def setAllowedAccessControlTagsUndefined: Self = StObject.set(x, "AllowedAccessControlTags", js.undefined)
    
    inline def setDescription(value: SecurityProfileDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: PermissionsList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: SecurityProfilePermission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setSecurityProfileName(value: CreateSecurityProfileName): Self = StObject.set(x, "SecurityProfileName", value.asInstanceOf[js.Any])
    
    inline def setTagRestrictedResources(value: TagRestrictedResourceList): Self = StObject.set(x, "TagRestrictedResources", value.asInstanceOf[js.Any])
    
    inline def setTagRestrictedResourcesUndefined: Self = StObject.set(x, "TagRestrictedResources", js.undefined)
    
    inline def setTagRestrictedResourcesVarargs(value: TagRestrictedResourceName*): Self = StObject.set(x, "TagRestrictedResources", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
