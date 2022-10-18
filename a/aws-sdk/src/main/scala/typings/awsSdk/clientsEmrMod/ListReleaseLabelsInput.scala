package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReleaseLabelsInput extends StObject {
  
  /**
    * Filters the results of the request. Prefix specifies the prefix of release labels to return. Application specifies the application (with/without version) of release labels to return.
    */
  var Filters: js.UndefOr[ReleaseLabelFilter] = js.undefined
  
  /**
    * Defines the maximum number of release labels to return in a single response. The default is 100.
    */
  var MaxResults: js.UndefOr[MaxResultsNumber] = js.undefined
  
  /**
    * Specifies the next page of results. If NextToken is not specified, which is usually the case for the first request of ListReleaseLabels, the first page of results are determined by other filtering parameters or by the latest version. The ListReleaseLabels request fails if the identity (Amazon Web Services account ID) and all filtering parameters are different from the original request, or if the NextToken is expired or tampered with.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListReleaseLabelsInput {
  
  inline def apply(): ListReleaseLabelsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReleaseLabelsInput]
  }
  
  extension [Self <: ListReleaseLabelsInput](x: Self) {
    
    inline def setFilters(value: ReleaseLabelFilter): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setMaxResults(value: MaxResultsNumber): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
