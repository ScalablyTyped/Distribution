package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppVersionResourceRequest extends StObject {
  
  /**
    * Currently, there is no supported additional information for resources.
    */
  var additionalInfo: js.UndefOr[AdditionalInfoMap] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * The list of Application Components that this resource belongs to. If an Application Component is not part of the Resilience Hub application, it will be added.
    */
  var appComponents: js.UndefOr[AppComponentNameList] = js.undefined
  
  /**
    * The Amazon Web Services account that owns the physical resource.
    */
  var awsAccountId: js.UndefOr[CustomerId] = js.undefined
  
  /**
    * The Amazon Web Services region that owns the physical resource.
    */
  var awsRegion: js.UndefOr[AwsRegion] = js.undefined
  
  /**
    * Indicates if a resource is excluded from an Resilience Hub application.  You can exclude only imported resources from an Resilience Hub application. 
    */
  var excluded: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The logical identifier of the resource.
    */
  var logicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined
  
  /**
    * The physical identifier of the resource.
    */
  var physicalResourceId: js.UndefOr[String2048] = js.undefined
  
  /**
    * The name of the resource.
    */
  var resourceName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The type of resource.
    */
  var resourceType: js.UndefOr[String255] = js.undefined
}
object UpdateAppVersionResourceRequest {
  
  inline def apply(appArn: Arn): UpdateAppVersionResourceRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppVersionResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAppVersionResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: AdditionalInfoMap): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppComponents(value: AppComponentNameList): Self = StObject.set(x, "appComponents", value.asInstanceOf[js.Any])
    
    inline def setAppComponentsUndefined: Self = StObject.set(x, "appComponents", js.undefined)
    
    inline def setAppComponentsVarargs(value: String255*): Self = StObject.set(x, "appComponents", js.Array(value*))
    
    inline def setAwsAccountId(value: CustomerId): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
    
    inline def setExcluded(value: BooleanOptional): Self = StObject.set(x, "excluded", value.asInstanceOf[js.Any])
    
    inline def setExcludedUndefined: Self = StObject.set(x, "excluded", js.undefined)
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "logicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setLogicalResourceIdUndefined: Self = StObject.set(x, "logicalResourceId", js.undefined)
    
    inline def setPhysicalResourceId(value: String2048): Self = StObject.set(x, "physicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceIdUndefined: Self = StObject.set(x, "physicalResourceId", js.undefined)
    
    inline def setResourceName(value: EntityName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: String255): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
