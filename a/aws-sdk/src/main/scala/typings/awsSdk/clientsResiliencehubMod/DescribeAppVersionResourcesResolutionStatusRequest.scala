package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppVersionResourcesResolutionStatusRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var appArn: Arn
  
  /**
    * The version of the application.
    */
  var appVersion: EntityVersion
  
  /**
    * The identifier for a specific resolution.
    */
  var resolutionId: js.UndefOr[String255] = js.undefined
}
object DescribeAppVersionResourcesResolutionStatusRequest {
  
  inline def apply(appArn: Arn, appVersion: EntityVersion): DescribeAppVersionResourcesResolutionStatusRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppVersionResourcesResolutionStatusRequest]
  }
  
  extension [Self <: DescribeAppVersionResourcesResolutionStatusRequest](x: Self) {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setResolutionId(value: String255): Self = StObject.set(x, "resolutionId", value.asInstanceOf[js.Any])
    
    inline def setResolutionIdUndefined: Self = StObject.set(x, "resolutionId", js.undefined)
  }
}
