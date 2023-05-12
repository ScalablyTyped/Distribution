package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerationSummary extends StObject {
  
  /**
    * Indicates the estimated time for when the recommendation generation will complete.
    */
  var EstimatedCompletionTime: js.UndefOr[ZonedDateTime] = js.undefined
  
  /**
    * Indicates the completion time of the recommendation generation.
    */
  var GenerationCompletionTime: js.UndefOr[ZonedDateTime] = js.undefined
  
  /**
    * Indicates the start time of the recommendation generation.
    */
  var GenerationStartedTime: js.UndefOr[ZonedDateTime] = js.undefined
  
  /**
    * Indicates whether the recommendation generation succeeded, is processing, or failed.
    */
  var GenerationStatus: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.GenerationStatus] = js.undefined
  
  /**
    * Indicates the ID for this specific recommendation.
    */
  var RecommendationId: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.RecommendationId] = js.undefined
}
object GenerationSummary {
  
  inline def apply(): GenerationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerationSummary] (val x: Self) extends AnyVal {
    
    inline def setEstimatedCompletionTime(value: ZonedDateTime): Self = StObject.set(x, "EstimatedCompletionTime", value.asInstanceOf[js.Any])
    
    inline def setEstimatedCompletionTimeUndefined: Self = StObject.set(x, "EstimatedCompletionTime", js.undefined)
    
    inline def setGenerationCompletionTime(value: ZonedDateTime): Self = StObject.set(x, "GenerationCompletionTime", value.asInstanceOf[js.Any])
    
    inline def setGenerationCompletionTimeUndefined: Self = StObject.set(x, "GenerationCompletionTime", js.undefined)
    
    inline def setGenerationStartedTime(value: ZonedDateTime): Self = StObject.set(x, "GenerationStartedTime", value.asInstanceOf[js.Any])
    
    inline def setGenerationStartedTimeUndefined: Self = StObject.set(x, "GenerationStartedTime", js.undefined)
    
    inline def setGenerationStatus(value: GenerationStatus): Self = StObject.set(x, "GenerationStatus", value.asInstanceOf[js.Any])
    
    inline def setGenerationStatusUndefined: Self = StObject.set(x, "GenerationStatus", js.undefined)
    
    inline def setRecommendationId(value: RecommendationId): Self = StObject.set(x, "RecommendationId", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdUndefined: Self = StObject.set(x, "RecommendationId", js.undefined)
  }
}
