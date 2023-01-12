package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEBSVolumeRecommendationsRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account for which to return volume recommendations. If your account is the management account of an organization, use this parameter to specify the member account for which you want to return volume recommendations. Only one account ID can be specified per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.undefined
  
  /**
    * An array of objects to specify a filter that returns a more specific list of volume recommendations.
    */
  var filters: js.UndefOr[EBSFilters] = js.undefined
  
  /**
    * The maximum number of volume recommendations to return with a single request. To retrieve the remaining results, make another request with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to advance to the next page of volume recommendations.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the volumes for which to return recommendations.
    */
  var volumeArns: js.UndefOr[VolumeArns] = js.undefined
}
object GetEBSVolumeRecommendationsRequest {
  
  inline def apply(): GetEBSVolumeRecommendationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEBSVolumeRecommendationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEBSVolumeRecommendationsRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value*))
    
    inline def setFilters(value: EBSFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: EBSFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVolumeArns(value: VolumeArns): Self = StObject.set(x, "volumeArns", value.asInstanceOf[js.Any])
    
    inline def setVolumeArnsUndefined: Self = StObject.set(x, "volumeArns", js.undefined)
    
    inline def setVolumeArnsVarargs(value: VolumeArn*): Self = StObject.set(x, "volumeArns", js.Array(value*))
  }
}
