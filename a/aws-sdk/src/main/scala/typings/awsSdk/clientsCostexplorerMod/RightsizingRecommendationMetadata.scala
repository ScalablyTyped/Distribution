package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RightsizingRecommendationMetadata extends StObject {
  
  /**
    * Additional metadata that might be applicable to the recommendation.
    */
  var AdditionalMetadata: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The timestamp for when Amazon Web Services made this recommendation.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The number of days of previous usage that Amazon Web Services considers when making this recommendation.
    */
  var LookbackPeriodInDays: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.LookbackPeriodInDays] = js.undefined
  
  /**
    * The ID for this specific recommendation.
    */
  var RecommendationId: js.UndefOr[GenericString] = js.undefined
}
object RightsizingRecommendationMetadata {
  
  inline def apply(): RightsizingRecommendationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightsizingRecommendationMetadata]
  }
  
  extension [Self <: RightsizingRecommendationMetadata](x: Self) {
    
    inline def setAdditionalMetadata(value: GenericString): Self = StObject.set(x, "AdditionalMetadata", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMetadataUndefined: Self = StObject.set(x, "AdditionalMetadata", js.undefined)
    
    inline def setGenerationTimestamp(value: GenericString): Self = StObject.set(x, "GenerationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setGenerationTimestampUndefined: Self = StObject.set(x, "GenerationTimestamp", js.undefined)
    
    inline def setLookbackPeriodInDays(value: LookbackPeriodInDays): Self = StObject.set(x, "LookbackPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setLookbackPeriodInDaysUndefined: Self = StObject.set(x, "LookbackPeriodInDays", js.undefined)
    
    inline def setRecommendationId(value: GenericString): Self = StObject.set(x, "RecommendationId", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdUndefined: Self = StObject.set(x, "RecommendationId", js.undefined)
  }
}
