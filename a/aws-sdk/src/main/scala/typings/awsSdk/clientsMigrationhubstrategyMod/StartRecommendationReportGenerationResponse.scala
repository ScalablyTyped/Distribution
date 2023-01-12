package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRecommendationReportGenerationResponse extends StObject {
  
  /**
    *  The ID of the recommendation report generation task. 
    */
  var id: js.UndefOr[RecommendationTaskId] = js.undefined
}
object StartRecommendationReportGenerationResponse {
  
  inline def apply(): StartRecommendationReportGenerationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRecommendationReportGenerationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartRecommendationReportGenerationResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: RecommendationTaskId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
