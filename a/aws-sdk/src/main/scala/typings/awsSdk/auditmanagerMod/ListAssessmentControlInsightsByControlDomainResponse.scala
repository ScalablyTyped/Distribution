package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssessmentControlInsightsByControlDomainResponse extends StObject {
  
  /**
    * The assessment control analytics data that the ListAssessmentControlInsightsByControlDomain API returned. 
    */
  var controlInsightsByAssessment: js.UndefOr[ControlInsightsMetadataByAssessment] = js.undefined
  
  /**
    * The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListAssessmentControlInsightsByControlDomainResponse {
  
  inline def apply(): ListAssessmentControlInsightsByControlDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssessmentControlInsightsByControlDomainResponse]
  }
  
  extension [Self <: ListAssessmentControlInsightsByControlDomainResponse](x: Self) {
    
    inline def setControlInsightsByAssessment(value: ControlInsightsMetadataByAssessment): Self = StObject.set(x, "controlInsightsByAssessment", value.asInstanceOf[js.Any])
    
    inline def setControlInsightsByAssessmentUndefined: Self = StObject.set(x, "controlInsightsByAssessment", js.undefined)
    
    inline def setControlInsightsByAssessmentVarargs(value: ControlInsightsMetadataByAssessmentItem*): Self = StObject.set(x, "controlInsightsByAssessment", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
