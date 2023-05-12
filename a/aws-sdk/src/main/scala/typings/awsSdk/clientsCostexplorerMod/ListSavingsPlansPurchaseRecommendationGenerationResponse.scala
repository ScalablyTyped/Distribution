package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSavingsPlansPurchaseRecommendationGenerationResponse extends StObject {
  
  /**
    * The list of historical recommendation generations.
    */
  var GenerationSummaryList: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.GenerationSummaryList] = js.undefined
  
  /**
    * The token to retrieve the next set of results.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
}
object ListSavingsPlansPurchaseRecommendationGenerationResponse {
  
  inline def apply(): ListSavingsPlansPurchaseRecommendationGenerationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSavingsPlansPurchaseRecommendationGenerationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSavingsPlansPurchaseRecommendationGenerationResponse] (val x: Self) extends AnyVal {
    
    inline def setGenerationSummaryList(value: GenerationSummaryList): Self = StObject.set(x, "GenerationSummaryList", value.asInstanceOf[js.Any])
    
    inline def setGenerationSummaryListUndefined: Self = StObject.set(x, "GenerationSummaryList", js.undefined)
    
    inline def setGenerationSummaryListVarargs(value: GenerationSummary*): Self = StObject.set(x, "GenerationSummaryList", js.Array(value*))
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
