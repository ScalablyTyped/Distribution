package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppVersionResourceRequest extends StObject {
  
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
  var appComponents: AppComponentNameList
  
  /**
    * The Amazon Web Services account that owns the physical resource.
    */
  var awsAccountId: js.UndefOr[CustomerId] = js.undefined
  
  /**
    * The Amazon Web Services region that owns the physical resource.
    */
  var awsRegion: js.UndefOr[AwsRegion] = js.undefined
  
  /**
    * Used for an idempotency token. A client token is a unique, case-sensitive string of up to 64 ASCII characters. You should not reuse the same client token for other API requests.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The logical identifier of the resource.
    */
  var logicalResourceId: LogicalResourceId
  
  /**
    * The physical identifier of the resource.
    */
  var physicalResourceId: String2048
  
  /**
    * The name of the resource.
    */
  var resourceName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The type of resource.
    */
  var resourceType: String255
}
object CreateAppVersionResourceRequest {
  
  inline def apply(
    appArn: Arn,
    appComponents: AppComponentNameList,
    logicalResourceId: LogicalResourceId,
    physicalResourceId: String2048,
    resourceType: String255
  ): CreateAppVersionResourceRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appComponents = appComponents.asInstanceOf[js.Any], logicalResourceId = logicalResourceId.asInstanceOf[js.Any], physicalResourceId = physicalResourceId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppVersionResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAppVersionResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: AdditionalInfoMap): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppComponents(value: AppComponentNameList): Self = StObject.set(x, "appComponents", value.asInstanceOf[js.Any])
    
    inline def setAppComponentsVarargs(value: String255*): Self = StObject.set(x, "appComponents", js.Array(value*))
    
    inline def setAwsAccountId(value: CustomerId): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "logicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceId(value: String2048): Self = StObject.set(x, "physicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: EntityName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: String255): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
