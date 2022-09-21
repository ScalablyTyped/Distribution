package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessPreviewFindingsRequest extends StObject {
  
  /**
    * The unique ID for the access preview.
    */
  var accessPreviewId: AccessPreviewId
  
  /**
    * The ARN of the analyzer used to generate the access.
    */
  var analyzerArn: AnalyzerArn
  
  /**
    * Criteria to filter the returned findings.
    */
  var filter: js.UndefOr[FilterCriteriaMap] = js.undefined
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListAccessPreviewFindingsRequest {
  
  inline def apply(accessPreviewId: AccessPreviewId, analyzerArn: AnalyzerArn): ListAccessPreviewFindingsRequest = {
    val __obj = js.Dynamic.literal(accessPreviewId = accessPreviewId.asInstanceOf[js.Any], analyzerArn = analyzerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessPreviewFindingsRequest]
  }
  
  extension [Self <: ListAccessPreviewFindingsRequest](x: Self) {
    
    inline def setAccessPreviewId(value: AccessPreviewId): Self = StObject.set(x, "accessPreviewId", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerArn(value: AnalyzerArn): Self = StObject.set(x, "analyzerArn", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: FilterCriteriaMap): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
