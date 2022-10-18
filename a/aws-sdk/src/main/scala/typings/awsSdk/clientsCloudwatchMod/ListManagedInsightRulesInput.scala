package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListManagedInsightRulesInput extends StObject {
  
  /**
    *  The maximum number of results to return in one operation. If you omit this parameter, the default number is used. The default number is 100. 
    */
  var MaxResults: js.UndefOr[InsightRuleMaxResults] = js.undefined
  
  /**
    *  Include this value to get the next set of rules if the value was returned by the previous operation. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.NextToken] = js.undefined
  
  /**
    *  The ARN of an Amazon Web Services resource that has managed Contributor Insights rules. 
    */
  var ResourceARN: AmazonResourceName
}
object ListManagedInsightRulesInput {
  
  inline def apply(ResourceARN: AmazonResourceName): ListManagedInsightRulesInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListManagedInsightRulesInput]
  }
  
  extension [Self <: ListManagedInsightRulesInput](x: Self) {
    
    inline def setMaxResults(value: InsightRuleMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceARN(value: AmazonResourceName): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
