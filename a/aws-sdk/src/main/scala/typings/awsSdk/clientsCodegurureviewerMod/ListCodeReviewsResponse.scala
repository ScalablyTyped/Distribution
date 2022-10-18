package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCodeReviewsResponse extends StObject {
  
  /**
    * A list of code reviews that meet the criteria of the request.
    */
  var CodeReviewSummaries: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.CodeReviewSummaries] = js.undefined
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.NextToken] = js.undefined
}
object ListCodeReviewsResponse {
  
  inline def apply(): ListCodeReviewsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCodeReviewsResponse]
  }
  
  extension [Self <: ListCodeReviewsResponse](x: Self) {
    
    inline def setCodeReviewSummaries(value: CodeReviewSummaries): Self = StObject.set(x, "CodeReviewSummaries", value.asInstanceOf[js.Any])
    
    inline def setCodeReviewSummariesUndefined: Self = StObject.set(x, "CodeReviewSummaries", js.undefined)
    
    inline def setCodeReviewSummariesVarargs(value: CodeReviewSummary*): Self = StObject.set(x, "CodeReviewSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
