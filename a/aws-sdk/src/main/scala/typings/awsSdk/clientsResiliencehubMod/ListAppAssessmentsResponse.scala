package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppAssessmentsResponse extends StObject {
  
  /**
    * The summaries for the specified assessments, returned as an object. This object includes application versions, associated Amazon Resource Numbers (ARNs), cost, messages, resiliency scores, and more.
    */
  var assessmentSummaries: AppAssessmentSummaryList
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAppAssessmentsResponse {
  
  inline def apply(assessmentSummaries: AppAssessmentSummaryList): ListAppAssessmentsResponse = {
    val __obj = js.Dynamic.literal(assessmentSummaries = assessmentSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppAssessmentsResponse]
  }
  
  extension [Self <: ListAppAssessmentsResponse](x: Self) {
    
    inline def setAssessmentSummaries(value: AppAssessmentSummaryList): Self = StObject.set(x, "assessmentSummaries", value.asInstanceOf[js.Any])
    
    inline def setAssessmentSummariesVarargs(value: AppAssessmentSummary*): Self = StObject.set(x, "assessmentSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
