package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLicenseVersionsRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the license.
    */
  var LicenseArn: Arn
  
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[MaxSize100] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListLicenseVersionsRequest {
  
  inline def apply(LicenseArn: Arn): ListLicenseVersionsRequest = {
    val __obj = js.Dynamic.literal(LicenseArn = LicenseArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLicenseVersionsRequest]
  }
  
  extension [Self <: ListLicenseVersionsRequest](x: Self) {
    
    inline def setLicenseArn(value: Arn): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
