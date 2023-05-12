package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSavingsPlansPurchaseRecommendationGenerationRequest extends StObject {
  
  /**
    * The status of the recommendation generation.
    */
  var GenerationStatus: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.GenerationStatus] = js.undefined
  
  /**
    * The token to retrieve the next set of results.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  
  /**
    * The number of recommendations that you want returned in a single response object.
    */
  var PageSize: js.UndefOr[NonNegativeInteger] = js.undefined
  
  /**
    * The IDs for each specific recommendation.
    */
  var RecommendationIds: js.UndefOr[RecommendationIdList] = js.undefined
}
object ListSavingsPlansPurchaseRecommendationGenerationRequest {
  
  inline def apply(): ListSavingsPlansPurchaseRecommendationGenerationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSavingsPlansPurchaseRecommendationGenerationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSavingsPlansPurchaseRecommendationGenerationRequest] (val x: Self) extends AnyVal {
    
    inline def setGenerationStatus(value: GenerationStatus): Self = StObject.set(x, "GenerationStatus", value.asInstanceOf[js.Any])
    
    inline def setGenerationStatusUndefined: Self = StObject.set(x, "GenerationStatus", js.undefined)
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setPageSize(value: NonNegativeInteger): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setRecommendationIds(value: RecommendationIdList): Self = StObject.set(x, "RecommendationIds", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdsUndefined: Self = StObject.set(x, "RecommendationIds", js.undefined)
    
    inline def setRecommendationIdsVarargs(value: RecommendationId*): Self = StObject.set(x, "RecommendationIds", js.Array(value*))
  }
}
