package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightsRequest extends StObject {
  
  /**
    * The ARNs of the insights to describe. If you do not provide any insight ARNs, then GetInsights returns all of your custom insights. It does not return any managed insights.
    */
  var InsightArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * The maximum number of items to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.MaxResults] = js.undefined
  
  /**
    * The token that is required for pagination. On your first call to the GetInsights operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
}
object GetInsightsRequest {
  
  inline def apply(): GetInsightsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInsightsRequest] (val x: Self) extends AnyVal {
    
    inline def setInsightArns(value: ArnList): Self = StObject.set(x, "InsightArns", value.asInstanceOf[js.Any])
    
    inline def setInsightArnsUndefined: Self = StObject.set(x, "InsightArns", js.undefined)
    
    inline def setInsightArnsVarargs(value: NonEmptyString*): Self = StObject.set(x, "InsightArns", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
