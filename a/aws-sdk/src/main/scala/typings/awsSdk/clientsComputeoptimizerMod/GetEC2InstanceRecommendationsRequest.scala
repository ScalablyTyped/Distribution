package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEC2InstanceRecommendationsRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account for which to return instance recommendations. If your account is the management account of an organization, use this parameter to specify the member account for which you want to return instance recommendations. Only one account ID can be specified per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.undefined
  
  /**
    * An array of objects to specify a filter that returns a more specific list of instance recommendations.
    */
  var filters: js.UndefOr[Filters] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the instances for which to return recommendations.
    */
  var instanceArns: js.UndefOr[InstanceArns] = js.undefined
  
  /**
    * The maximum number of instance recommendations to return with a single request. To retrieve the remaining results, make another request with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to advance to the next page of instance recommendations.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An object to specify the preferences for the Amazon EC2 instance recommendations to return in the response.
    */
  var recommendationPreferences: js.UndefOr[RecommendationPreferences] = js.undefined
}
object GetEC2InstanceRecommendationsRequest {
  
  inline def apply(): GetEC2InstanceRecommendationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEC2InstanceRecommendationsRequest]
  }
  
  extension [Self <: GetEC2InstanceRecommendationsRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value*))
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setInstanceArns(value: InstanceArns): Self = StObject.set(x, "instanceArns", value.asInstanceOf[js.Any])
    
    inline def setInstanceArnsUndefined: Self = StObject.set(x, "instanceArns", js.undefined)
    
    inline def setInstanceArnsVarargs(value: InstanceArn*): Self = StObject.set(x, "instanceArns", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRecommendationPreferences(value: RecommendationPreferences): Self = StObject.set(x, "recommendationPreferences", value.asInstanceOf[js.Any])
    
    inline def setRecommendationPreferencesUndefined: Self = StObject.set(x, "recommendationPreferences", js.undefined)
  }
}
