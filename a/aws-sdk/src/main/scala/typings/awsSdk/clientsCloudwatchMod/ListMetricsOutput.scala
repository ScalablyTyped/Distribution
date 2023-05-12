package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetricsOutput extends StObject {
  
  /**
    * The metrics that match your request. 
    */
  var Metrics: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Metrics] = js.undefined
  
  /**
    * The token that marks the start of the next batch of returned results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.NextToken] = js.undefined
  
  /**
    * If you are using this operation in a monitoring account, this array contains the account IDs of the source accounts where the metrics in the returned data are from. This field is a 1:1 mapping between each metric that is returned and the ID of the owning account.
    */
  var OwningAccounts: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.OwningAccounts] = js.undefined
}
object ListMetricsOutput {
  
  inline def apply(): ListMetricsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMetricsOutput] (val x: Self) extends AnyVal {
    
    inline def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "Metrics", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOwningAccounts(value: OwningAccounts): Self = StObject.set(x, "OwningAccounts", value.asInstanceOf[js.Any])
    
    inline def setOwningAccountsUndefined: Self = StObject.set(x, "OwningAccounts", js.undefined)
    
    inline def setOwningAccountsVarargs(value: AccountId*): Self = StObject.set(x, "OwningAccounts", js.Array(value*))
  }
}
