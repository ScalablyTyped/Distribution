package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightsByAssessmentResponse extends StObject {
  
  /**
    *  The assessment analytics data that the GetInsightsByAssessment API returned. 
    */
  var insights: js.UndefOr[InsightsByAssessment] = js.undefined
}
object GetInsightsByAssessmentResponse {
  
  inline def apply(): GetInsightsByAssessmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightsByAssessmentResponse]
  }
  
  extension [Self <: GetInsightsByAssessmentResponse](x: Self) {
    
    inline def setInsights(value: InsightsByAssessment): Self = StObject.set(x, "insights", value.asInstanceOf[js.Any])
    
    inline def setInsightsUndefined: Self = StObject.set(x, "insights", js.undefined)
  }
}
