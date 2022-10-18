package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListControlDomainInsightsByAssessmentRequest extends StObject {
  
  /**
    * The unique identifier for the active assessment. 
    */
  var assessmentId: UUID
  
  /**
    * Represents the maximum number of results on a page or for an API request call. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListControlDomainInsightsByAssessmentRequest {
  
  inline def apply(assessmentId: UUID): ListControlDomainInsightsByAssessmentRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListControlDomainInsightsByAssessmentRequest]
  }
  
  extension [Self <: ListControlDomainInsightsByAssessmentRequest](x: Self) {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
