package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityProfile extends StObject {
  
  /**
    * The list of tags that a security profile uses to restrict access to resources in Amazon Connect.
    */
  var AllowedAccessControlTags: js.UndefOr[typings.awsSdk.clientsConnectMod.AllowedAccessControlTags] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the secruity profile.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The description of the security profile.
    */
  var Description: js.UndefOr[SecurityProfileDescription] = js.undefined
  
  /**
    * The identifier for the security profile.
    */
  var Id: js.UndefOr[SecurityProfileId] = js.undefined
  
  /**
    * The organization resource identifier for the security profile.
    */
  var OrganizationResourceId: js.UndefOr[InstanceId] = js.undefined
  
  /**
    * The name for the security profile.
    */
  var SecurityProfileName: js.UndefOr[typings.awsSdk.clientsConnectMod.SecurityProfileName] = js.undefined
  
  /**
    * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
    */
  var TagRestrictedResources: js.UndefOr[TagRestrictedResourceList] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object SecurityProfile {
  
  inline def apply(): SecurityProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityProfile] (val x: Self) extends AnyVal {
    
    inline def setAllowedAccessControlTags(value: AllowedAccessControlTags): Self = StObject.set(x, "AllowedAccessControlTags", value.asInstanceOf[js.Any])
    
    inline def setAllowedAccessControlTagsUndefined: Self = StObject.set(x, "AllowedAccessControlTags", js.undefined)
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: SecurityProfileDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: SecurityProfileId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setOrganizationResourceId(value: InstanceId): Self = StObject.set(x, "OrganizationResourceId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationResourceIdUndefined: Self = StObject.set(x, "OrganizationResourceId", js.undefined)
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "SecurityProfileName", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileNameUndefined: Self = StObject.set(x, "SecurityProfileName", js.undefined)
    
    inline def setTagRestrictedResources(value: TagRestrictedResourceList): Self = StObject.set(x, "TagRestrictedResources", value.asInstanceOf[js.Any])
    
    inline def setTagRestrictedResourcesUndefined: Self = StObject.set(x, "TagRestrictedResources", js.undefined)
    
    inline def setTagRestrictedResourcesVarargs(value: TagRestrictedResourceName*): Self = StObject.set(x, "TagRestrictedResources", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
