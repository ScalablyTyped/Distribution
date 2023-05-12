package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceSharePermissionDetail extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of this RAM managed permission.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the permission was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies whether the version of the permission represented in this response is the default version for this permission.
    */
  var defaultVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates what features are available for this resource share. This parameter can have one of the following values:    STANDARD – A resource share that supports all functionality. These resource shares are visible to all principals you share the resource share with. You can modify these resource shares in RAM using the console or APIs. This resource share might have been created by RAM, or it might have been CREATED_FROM_POLICY and then promoted.    CREATED_FROM_POLICY – The customer manually shared a resource by attaching a resource-based policy. That policy did not match any existing managed permissions, so RAM created this customer managed permission automatically on the customer's behalf based on the attached policy document. This type of resource share is visible only to the Amazon Web Services account that created it. You can't modify it in RAM unless you promote it. For more information, see PromoteResourceShareCreatedFromPolicy.    PROMOTING_TO_STANDARD – This resource share was originally CREATED_FROM_POLICY, but the customer ran the PromoteResourceShareCreatedFromPolicy and that operation is still in progress. This value changes to STANDARD when complete.  
    */
  var featureSet: js.UndefOr[PermissionFeatureSet] = js.undefined
  
  /**
    * Specifies whether the version of the permission represented in this response is the default version for all resources of this resource type.
    */
  var isResourceTypeDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time when the permission was last updated.
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of this permission.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The permission's effect and actions in JSON format. The effect indicates whether the specified actions are allowed or denied. The actions list the operations to which the principal is granted or denied access.
    */
  var permission: js.UndefOr[String] = js.undefined
  
  /**
    * The type of managed permission. This can be one of the following values:    AWS_MANAGED – Amazon Web Services created and manages this managed permission. You can associate it with your resource shares, but you can't modify it.    CUSTOMER_MANAGED – You, or another principal in your account created this managed permission. You can associate it with your resource shares and create new versions that have different permissions.  
    */
  var permissionType: js.UndefOr[PermissionType] = js.undefined
  
  /**
    * The resource type to which this permission applies.
    */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the association between the permission and the resource share. The following are the possible values:    ATTACHABLE – This permission or version can be associated with resource shares.    UNATTACHABLE – This permission or version can't currently be associated with resource shares.    DELETING – This permission or version is in the process of being deleted.    DELETED – This permission or version is deleted.  
    */
  var status: js.UndefOr[PermissionStatus] = js.undefined
  
  /**
    * The tag key and value pairs attached to the resource share.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The version of the permission described in this response.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ResourceSharePermissionDetail {
  
  inline def apply(): ResourceSharePermissionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSharePermissionDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceSharePermissionDetail] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDefaultVersion(value: Boolean): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionUndefined: Self = StObject.set(x, "defaultVersion", js.undefined)
    
    inline def setFeatureSet(value: PermissionFeatureSet): Self = StObject.set(x, "featureSet", value.asInstanceOf[js.Any])
    
    inline def setFeatureSetUndefined: Self = StObject.set(x, "featureSet", js.undefined)
    
    inline def setIsResourceTypeDefault(value: Boolean): Self = StObject.set(x, "isResourceTypeDefault", value.asInstanceOf[js.Any])
    
    inline def setIsResourceTypeDefaultUndefined: Self = StObject.set(x, "isResourceTypeDefault", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionType(value: PermissionType): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setStatus(value: PermissionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
