package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSavingsPlansPurchaseRecommendationGenerationResponse extends StObject {
  
  /**
    * The estimated time for when the recommendation generation will complete.
    */
  var EstimatedCompletionTime: js.UndefOr[ZonedDateTime] = js.undefined
  
  /**
    * The start time of the recommendation generation.
    */
  var GenerationStartedTime: js.UndefOr[ZonedDateTime] = js.undefined
  
  /**
    * The ID for this specific recommendation.
    */
  var RecommendationId: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.RecommendationId] = js.undefined
}
object StartSavingsPlansPurchaseRecommendationGenerationResponse {
  
  inline def apply(): StartSavingsPlansPurchaseRecommendationGenerationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSavingsPlansPurchaseRecommendationGenerationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSavingsPlansPurchaseRecommendationGenerationResponse] (val x: Self) extends AnyVal {
    
    inline def setEstimatedCompletionTime(value: ZonedDateTime): Self = StObject.set(x, "EstimatedCompletionTime", value.asInstanceOf[js.Any])
    
    inline def setEstimatedCompletionTimeUndefined: Self = StObject.set(x, "EstimatedCompletionTime", js.undefined)
    
    inline def setGenerationStartedTime(value: ZonedDateTime): Self = StObject.set(x, "GenerationStartedTime", value.asInstanceOf[js.Any])
    
    inline def setGenerationStartedTimeUndefined: Self = StObject.set(x, "GenerationStartedTime", js.undefined)
    
    inline def setRecommendationId(value: RecommendationId): Self = StObject.set(x, "RecommendationId", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdUndefined: Self = StObject.set(x, "RecommendationId", js.undefined)
  }
}
