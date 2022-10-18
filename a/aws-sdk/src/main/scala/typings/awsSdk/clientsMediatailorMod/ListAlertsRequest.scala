package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlertsRequest extends StObject {
  
  /**
    * Upper bound on number of records to return. The maximum number of results is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsMediatailorMod.MaxResults] = js.undefined
  
  /**
    * Pagination token from the GET list request. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: string
}
object ListAlertsRequest {
  
  inline def apply(ResourceArn: string): ListAlertsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlertsRequest]
  }
  
  extension [Self <: ListAlertsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
