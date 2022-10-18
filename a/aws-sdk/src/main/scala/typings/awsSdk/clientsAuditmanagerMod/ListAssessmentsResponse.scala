package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssessmentsResponse extends StObject {
  
  /**
    *  The metadata that's associated with the assessment. 
    */
  var assessmentMetadata: js.UndefOr[ListAssessmentMetadata] = js.undefined
  
  /**
    *  The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListAssessmentsResponse {
  
  inline def apply(): ListAssessmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssessmentsResponse]
  }
  
  extension [Self <: ListAssessmentsResponse](x: Self) {
    
    inline def setAssessmentMetadata(value: ListAssessmentMetadata): Self = StObject.set(x, "assessmentMetadata", value.asInstanceOf[js.Any])
    
    inline def setAssessmentMetadataUndefined: Self = StObject.set(x, "assessmentMetadata", js.undefined)
    
    inline def setAssessmentMetadataVarargs(value: AssessmentMetadataItem*): Self = StObject.set(x, "assessmentMetadata", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
