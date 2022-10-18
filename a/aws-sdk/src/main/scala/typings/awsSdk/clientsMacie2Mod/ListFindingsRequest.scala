package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingsRequest extends StObject {
  
  /**
    * The criteria to use to filter the results.
    */
  var findingCriteria: js.UndefOr[FindingCriteria] = js.undefined
  
  /**
    * The maximum number of items to include in each page of the response.
    */
  var maxResults: js.UndefOr[integer] = js.undefined
  
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The criteria to use to sort the results.
    */
  var sortCriteria: js.UndefOr[SortCriteria] = js.undefined
}
object ListFindingsRequest {
  
  inline def apply(): ListFindingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingsRequest]
  }
  
  extension [Self <: ListFindingsRequest](x: Self) {
    
    inline def setFindingCriteria(value: FindingCriteria): Self = StObject.set(x, "findingCriteria", value.asInstanceOf[js.Any])
    
    inline def setFindingCriteriaUndefined: Self = StObject.set(x, "findingCriteria", js.undefined)
    
    inline def setMaxResults(value: integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortCriteria(value: SortCriteria): Self = StObject.set(x, "sortCriteria", value.asInstanceOf[js.Any])
    
    inline def setSortCriteriaUndefined: Self = StObject.set(x, "sortCriteria", js.undefined)
  }
}
