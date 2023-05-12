package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceSharePermissionSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the permission you want information about.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the permission was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies whether the version of the managed permission used by this resource share is the default version for this managed permission.
    */
  var defaultVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates what features are available for this resource share. This parameter can have one of the following values:    STANDARD – A resource share that supports all functionality. These resource shares are visible to all principals you share the resource share with. You can modify these resource shares in RAM using the console or APIs. This resource share might have been created by RAM, or it might have been CREATED_FROM_POLICY and then promoted.    CREATED_FROM_POLICY – The customer manually shared a resource by attaching a resource-based policy. That policy did not match any existing managed permissions, so RAM created this customer managed permission automatically on the customer's behalf based on the attached policy document. This type of resource share is visible only to the Amazon Web Services account that created it. You can't modify it in RAM unless you promote it. For more information, see PromoteResourceShareCreatedFromPolicy.    PROMOTING_TO_STANDARD – This resource share was originally CREATED_FROM_POLICY, but the customer ran the PromoteResourceShareCreatedFromPolicy and that operation is still in progress. This value changes to STANDARD when complete.  
    */
  var featureSet: js.UndefOr[PermissionFeatureSet] = js.undefined
  
  /**
    * Specifies whether the managed permission associated with this resource share is the default managed permission for all resources of this resource type.
    */
  var isResourceTypeDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time when the permission was last updated.
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of this managed permission.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of managed permission. This can be one of the following values:    AWS_MANAGED – Amazon Web Services created and manages this managed permission. You can associate it with your resource shares, but you can't modify it.    CUSTOMER_MANAGED – You, or another principal in your account created this managed permission. You can associate it with your resource shares and create new versions that have different permissions.  
    */
  var permissionType: js.UndefOr[PermissionType] = js.undefined
  
  /**
    * The type of resource to which this permission applies. This takes the form of: service-code:resource-code, and is case-insensitive. For example, an Amazon EC2 Subnet would be represented by the string ec2:subnet.
    */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the permission.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * A list of the tag key value pairs currently attached to the permission.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The version of the permission associated with this resource share.
    */
  var version: js.UndefOr[String] = js.undefined
}
object ResourceSharePermissionSummary {
  
  inline def apply(): ResourceSharePermissionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSharePermissionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceSharePermissionSummary] (val x: Self) extends AnyVal {
    
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
    
    inline def setPermissionType(value: PermissionType): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
