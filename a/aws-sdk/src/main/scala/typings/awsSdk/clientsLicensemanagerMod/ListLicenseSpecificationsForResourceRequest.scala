package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLicenseSpecificationsForResourceRequest extends StObject {
  
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of a resource that has an associated license configuration.
    */
  var ResourceArn: String
}
object ListLicenseSpecificationsForResourceRequest {
  
  inline def apply(ResourceArn: String): ListLicenseSpecificationsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLicenseSpecificationsForResourceRequest]
  }
  
  extension [Self <: ListLicenseSpecificationsForResourceRequest](x: Self) {
    
    inline def setMaxResults(value: BoxInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
