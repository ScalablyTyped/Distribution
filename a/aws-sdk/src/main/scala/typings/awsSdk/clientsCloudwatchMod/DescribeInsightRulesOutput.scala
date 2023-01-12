package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInsightRulesOutput extends StObject {
  
  /**
    * The rules returned by the operation.
    */
  var InsightRules: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.InsightRules] = js.undefined
  
  /**
    * If this parameter is present, it is a token that marks the start of the next batch of returned results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.NextToken] = js.undefined
}
object DescribeInsightRulesOutput {
  
  inline def apply(): DescribeInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInsightRulesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInsightRulesOutput] (val x: Self) extends AnyVal {
    
    inline def setInsightRules(value: InsightRules): Self = StObject.set(x, "InsightRules", value.asInstanceOf[js.Any])
    
    inline def setInsightRulesUndefined: Self = StObject.set(x, "InsightRules", js.undefined)
    
    inline def setInsightRulesVarargs(value: InsightRule*): Self = StObject.set(x, "InsightRules", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
