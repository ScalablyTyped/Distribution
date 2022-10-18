package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVodSourcesRequest extends StObject {
  
  /**
    * Upper bound on number of records to return. The maximum number of results is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsMediatailorMod.MaxResults] = js.undefined
  
  /**
    * Pagination token from the GET list request. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The identifier for the source location you are working on.
    */
  var SourceLocationName: string
}
object ListVodSourcesRequest {
  
  inline def apply(SourceLocationName: string): ListVodSourcesRequest = {
    val __obj = js.Dynamic.literal(SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVodSourcesRequest]
  }
  
  extension [Self <: ListVodSourcesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
  }
}
