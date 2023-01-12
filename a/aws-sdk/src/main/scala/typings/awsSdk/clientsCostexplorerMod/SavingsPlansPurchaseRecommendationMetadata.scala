package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlansPurchaseRecommendationMetadata extends StObject {
  
  /**
    * Additional metadata that might be applicable to the recommendation.
    */
  var AdditionalMetadata: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The timestamp that shows when the recommendations were generated.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The unique identifier for the recommendation set.
    */
  var RecommendationId: js.UndefOr[GenericString] = js.undefined
}
object SavingsPlansPurchaseRecommendationMetadata {
  
  inline def apply(): SavingsPlansPurchaseRecommendationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansPurchaseRecommendationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsPlansPurchaseRecommendationMetadata] (val x: Self) extends AnyVal {
    
    inline def setAdditionalMetadata(value: GenericString): Self = StObject.set(x, "AdditionalMetadata", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMetadataUndefined: Self = StObject.set(x, "AdditionalMetadata", js.undefined)
    
    inline def setGenerationTimestamp(value: GenericString): Self = StObject.set(x, "GenerationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setGenerationTimestampUndefined: Self = StObject.set(x, "GenerationTimestamp", js.undefined)
    
    inline def setRecommendationId(value: GenericString): Self = StObject.set(x, "RecommendationId", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdUndefined: Self = StObject.set(x, "RecommendationId", js.undefined)
  }
}
