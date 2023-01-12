package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightsResponse extends StObject {
  
  /**
    * The insights returned by the operation.
    */
  var Insights: InsightList
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
}
object GetInsightsResponse {
  
  inline def apply(Insights: InsightList): GetInsightsResponse = {
    val __obj = js.Dynamic.literal(Insights = Insights.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInsightsResponse] (val x: Self) extends AnyVal {
    
    inline def setInsights(value: InsightList): Self = StObject.set(x, "Insights", value.asInstanceOf[js.Any])
    
    inline def setInsightsVarargs(value: Insight*): Self = StObject.set(x, "Insights", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
