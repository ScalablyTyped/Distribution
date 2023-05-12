package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatedPermission extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the associated managed permission.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the associated resource share is using the default version of the permission.
    */
  var defaultVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates what features are available for this resource share. This parameter can have one of the following values:    STANDARD – A resource share that supports all functionality. These resource shares are visible to all principals you share the resource share with. You can modify these resource shares in RAM using the console or APIs. This resource share might have been created by RAM, or it might have been CREATED_FROM_POLICY and then promoted.    CREATED_FROM_POLICY – The customer manually shared a resource by attaching a resource-based policy. That policy did not match any existing managed permissions, so RAM created this customer managed permission automatically on the customer's behalf based on the attached policy document. This type of resource share is visible only to the Amazon Web Services account that created it. You can't modify it in RAM unless you promote it. For more information, see PromoteResourceShareCreatedFromPolicy.    PROMOTING_TO_STANDARD – This resource share was originally CREATED_FROM_POLICY, but the customer ran the PromoteResourceShareCreatedFromPolicy and that operation is still in progress. This value changes to STANDARD when complete.  
    */
  var featureSet: js.UndefOr[PermissionFeatureSet] = js.undefined
  
  /**
    * The date and time when the association between the permission and the resource share was last updated.
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The version of the permission currently associated with the resource share.
    */
  var permissionVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a resource share associated with this permission.
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
  
  /**
    * The resource type to which this permission applies.
    */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the association between the permission and the resource share. The following are the possible values:    ATTACHABLE – This permission or version can be associated with resource shares.    UNATTACHABLE – This permission or version can't currently be associated with resource shares.    DELETING – This permission or version is in the process of being deleted.    DELETED – This permission or version is deleted.  
    */
  var status: js.UndefOr[String] = js.undefined
}
object AssociatedPermission {
  
  inline def apply(): AssociatedPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatedPermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociatedPermission] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDefaultVersion(value: Boolean): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionUndefined: Self = StObject.set(x, "defaultVersion", js.undefined)
    
    inline def setFeatureSet(value: PermissionFeatureSet): Self = StObject.set(x, "featureSet", value.asInstanceOf[js.Any])
    
    inline def setFeatureSetUndefined: Self = StObject.set(x, "featureSet", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setPermissionVersion(value: String): Self = StObject.set(x, "permissionVersion", value.asInstanceOf[js.Any])
    
    inline def setPermissionVersionUndefined: Self = StObject.set(x, "permissionVersion", js.undefined)
    
    inline def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
