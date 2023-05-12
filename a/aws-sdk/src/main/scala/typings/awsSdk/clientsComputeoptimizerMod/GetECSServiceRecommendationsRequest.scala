package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetECSServiceRecommendationsRequest extends StObject {
  
  /**
    *  Return the Amazon ECS service recommendations to the specified Amazon Web Services account IDs.  If your account is the management account or the delegated administrator of an organization, use this parameter to return the Amazon ECS service recommendations to specific member accounts. You can only specify one account ID per request.
    */
  var accountIds: js.UndefOr[AccountIds] = js.undefined
  
  /**
    *  An array of objects to specify a filter that returns a more specific list of Amazon ECS service recommendations. 
    */
  var filters: js.UndefOr[ECSServiceRecommendationFilters] = js.undefined
  
  /**
    *  The maximum number of Amazon ECS service recommendations to return with a single request.  To retrieve the remaining results, make another request with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The token to advance to the next page of Amazon ECS service recommendations. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  The ARN that identifies the Amazon ECS service.   The following is the format of the ARN:   arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name 
    */
  var serviceArns: js.UndefOr[ServiceArns] = js.undefined
}
object GetECSServiceRecommendationsRequest {
  
  inline def apply(): GetECSServiceRecommendationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetECSServiceRecommendationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetECSServiceRecommendationsRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: AccountIds): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "accountIds", js.Array(value*))
    
    inline def setFilters(value: ECSServiceRecommendationFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ECSServiceRecommendationFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServiceArns(value: ServiceArns): Self = StObject.set(x, "serviceArns", value.asInstanceOf[js.Any])
    
    inline def setServiceArnsUndefined: Self = StObject.set(x, "serviceArns", js.undefined)
    
    inline def setServiceArnsVarargs(value: ServiceArn*): Self = StObject.set(x, "serviceArns", js.Array(value*))
  }
}
