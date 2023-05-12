package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppVersionResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var appArn: Arn
  
  /**
    * The Resilience Hub application version.
    */
  var appVersion: EntityVersion
  
  /**
    * The Amazon Web Services account that owns the physical resource.
    */
  var awsAccountId: js.UndefOr[CustomerId] = js.undefined
  
  /**
    * The Amazon Web Services region that owns the physical resource.
    */
  var awsRegion: js.UndefOr[AwsRegion] = js.undefined
  
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
}
object DescribeAppVersionResourceRequest {
  
  inline def apply(appArn: Arn, appVersion: EntityVersion): DescribeAppVersionResourceRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppVersionResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppVersionResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: CustomerId): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "logicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setLogicalResourceIdUndefined: Self = StObject.set(x, "logicalResourceId", js.undefined)
    
    inline def setPhysicalResourceId(value: String2048): Self = StObject.set(x, "physicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceIdUndefined: Self = StObject.set(x, "physicalResourceId", js.undefined)
    
    inline def setResourceName(value: EntityName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
