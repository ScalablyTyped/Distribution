package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDraftAppVersionResourcesImportStatusRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var appArn: Arn
}
object DescribeDraftAppVersionResourcesImportStatusRequest {
  
  inline def apply(appArn: Arn): DescribeDraftAppVersionResourcesImportStatusRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDraftAppVersionResourcesImportStatusRequest]
  }
  
  extension [Self <: DescribeDraftAppVersionResourcesImportStatusRequest](x: Self) {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
  }
}
