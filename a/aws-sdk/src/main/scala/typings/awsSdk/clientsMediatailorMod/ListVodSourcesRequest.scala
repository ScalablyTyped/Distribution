package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVodSourcesRequest extends StObject {
  
  /**
    *  The maximum number of VOD sources that you want MediaTailor to return in response to the current request. If there are more than MaxResults VOD sources, use the value of NextToken in the response to get the next page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsMediatailorMod.MaxResults] = js.undefined
  
  /**
    * Pagination token returned by the list request when results exceed the maximum allowed. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the source location associated with this VOD Source list.
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
