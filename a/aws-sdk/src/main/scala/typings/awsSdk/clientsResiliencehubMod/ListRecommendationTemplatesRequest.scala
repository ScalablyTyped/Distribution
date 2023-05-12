package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecommendationTemplatesRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:partition:resiliencehub:region:account:app-assessment/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var assessmentArn: Arn
  
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The name for one of the listed recommendation templates.
    */
  var name: js.UndefOr[EntityName] = js.undefined
  
  /**
    * Null, or the token from a previous call to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for a recommendation template.
    */
  var recommendationTemplateArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The default is to sort by ascending startTime. To sort by descending startTime, set reverseOrder to true.
    */
  var reverseOrder: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The status of the action.
    */
  var status: js.UndefOr[RecommendationTemplateStatusList] = js.undefined
}
object ListRecommendationTemplatesRequest {
  
  inline def apply(assessmentArn: Arn): ListRecommendationTemplatesRequest = {
    val __obj = js.Dynamic.literal(assessmentArn = assessmentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecommendationTemplatesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRecommendationTemplatesRequest] (val x: Self) extends AnyVal {
    
    inline def setAssessmentArn(value: Arn): Self = StObject.set(x, "assessmentArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRecommendationTemplateArn(value: Arn): Self = StObject.set(x, "recommendationTemplateArn", value.asInstanceOf[js.Any])
    
    inline def setRecommendationTemplateArnUndefined: Self = StObject.set(x, "recommendationTemplateArn", js.undefined)
    
    inline def setReverseOrder(value: BooleanOptional): Self = StObject.set(x, "reverseOrder", value.asInstanceOf[js.Any])
    
    inline def setReverseOrderUndefined: Self = StObject.set(x, "reverseOrder", js.undefined)
    
    inline def setStatus(value: RecommendationTemplateStatusList): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVarargs(value: RecommendationTemplateStatus*): Self = StObject.set(x, "status", js.Array(value*))
  }
}
