package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFindingsRequest extends StObject {
  
  /**
    * The ARN of the analyzer to retrieve findings from.
    */
  var analyzerArn: AnalyzerArn = js.native
  
  /**
    * A filter to match for the findings to return.
    */
  var filter: js.UndefOr[FilterCriteriaMap] = js.native
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.native
  
  /**
    * The sort order for the findings returned.
    */
  var sort: js.UndefOr[SortCriteria] = js.native
}
object ListFindingsRequest {
  
  @scala.inline
  def apply(analyzerArn: AnalyzerArn): ListFindingsRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsRequest]
  }
  
  @scala.inline
  implicit class ListFindingsRequestMutableBuilder[Self <: ListFindingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzerArn(value: AnalyzerArn): Self = StObject.set(x, "analyzerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: FilterCriteriaMap): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSort(value: SortCriteria): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
