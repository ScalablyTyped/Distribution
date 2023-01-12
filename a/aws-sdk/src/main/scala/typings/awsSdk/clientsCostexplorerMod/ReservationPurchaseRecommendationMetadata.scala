package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationPurchaseRecommendationMetadata extends StObject {
  
  /**
    * The timestamp for when Amazon Web Services made this recommendation.
    */
  var GenerationTimestamp: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The ID for this specific recommendation.
    */
  var RecommendationId: js.UndefOr[GenericString] = js.undefined
}
object ReservationPurchaseRecommendationMetadata {
  
  inline def apply(): ReservationPurchaseRecommendationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPurchaseRecommendationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReservationPurchaseRecommendationMetadata] (val x: Self) extends AnyVal {
    
    inline def setGenerationTimestamp(value: GenericString): Self = StObject.set(x, "GenerationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setGenerationTimestampUndefined: Self = StObject.set(x, "GenerationTimestamp", js.undefined)
    
    inline def setRecommendationId(value: GenericString): Self = StObject.set(x, "RecommendationId", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdUndefined: Self = StObject.set(x, "RecommendationId", js.undefined)
  }
}
