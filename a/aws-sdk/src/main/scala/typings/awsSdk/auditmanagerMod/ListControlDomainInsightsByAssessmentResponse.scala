package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListControlDomainInsightsByAssessmentResponse extends StObject {
  
  /**
    * The control domain analytics data that the ListControlDomainInsightsByAssessment API returned. 
    */
  var controlDomainInsights: js.UndefOr[ControlDomainInsightsList] = js.undefined
  
  /**
    * The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListControlDomainInsightsByAssessmentResponse {
  
  inline def apply(): ListControlDomainInsightsByAssessmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListControlDomainInsightsByAssessmentResponse]
  }
  
  extension [Self <: ListControlDomainInsightsByAssessmentResponse](x: Self) {
    
    inline def setControlDomainInsights(value: ControlDomainInsightsList): Self = StObject.set(x, "controlDomainInsights", value.asInstanceOf[js.Any])
    
    inline def setControlDomainInsightsUndefined: Self = StObject.set(x, "controlDomainInsights", js.undefined)
    
    inline def setControlDomainInsightsVarargs(value: ControlDomainInsights*): Self = StObject.set(x, "controlDomainInsights", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
