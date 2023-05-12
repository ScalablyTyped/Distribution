package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionAssociationsRequest extends StObject {
  
  /**
    * Specifies that you want to list only those associations with resource shares that match this status.
    */
  var associationStatus: js.UndefOr[ResourceShareAssociationStatus] = js.undefined
  
  /**
    * When true, specifies that you want to list only those associations with resource shares that use the default version of the specified managed permission. When false (the default value), lists associations with resource shares that use any version of the specified managed permission.
    */
  var defaultVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies that you want to list only those associations with resource shares that have a featureSet with this value.
    */
  var featureSet: js.UndefOr[PermissionFeatureSet] = js.undefined
  
  /**
    * Specifies the total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the number you specify, the NextToken response element is returned with a value (not null). Include the specified value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that the service might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Specifies that you want to receive the next page of results. Valid only if you received a NextToken response in the previous request. If you did, it indicates that more output is available. Set this parameter to the value provided by the previous call's NextToken response to request the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the managed permission.
    */
  var permissionArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that you want to list only those associations with resource shares that use this version of the managed permission. If you don't provide a value for this parameter, then the operation returns information about associations with resource shares that use any version of the managed permission.
    */
  var permissionVersion: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies that you want to list only those associations with resource shares that include at least one resource of this resource type.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}
object ListPermissionAssociationsRequest {
  
  inline def apply(): ListPermissionAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPermissionAssociationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPermissionAssociationsRequest] (val x: Self) extends AnyVal {
    
    inline def setAssociationStatus(value: ResourceShareAssociationStatus): Self = StObject.set(x, "associationStatus", value.asInstanceOf[js.Any])
    
    inline def setAssociationStatusUndefined: Self = StObject.set(x, "associationStatus", js.undefined)
    
    inline def setDefaultVersion(value: Boolean): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionUndefined: Self = StObject.set(x, "defaultVersion", js.undefined)
    
    inline def setFeatureSet(value: PermissionFeatureSet): Self = StObject.set(x, "featureSet", value.asInstanceOf[js.Any])
    
    inline def setFeatureSetUndefined: Self = StObject.set(x, "featureSet", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPermissionArn(value: String): Self = StObject.set(x, "permissionArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionArnUndefined: Self = StObject.set(x, "permissionArn", js.undefined)
    
    inline def setPermissionVersion(value: Integer): Self = StObject.set(x, "permissionVersion", value.asInstanceOf[js.Any])
    
    inline def setPermissionVersionUndefined: Self = StObject.set(x, "permissionVersion", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
