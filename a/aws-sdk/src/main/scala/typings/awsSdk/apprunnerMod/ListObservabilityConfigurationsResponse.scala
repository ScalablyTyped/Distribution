package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObservabilityConfigurationsResponse extends StObject {
  
  /**
    * The token that you can pass in a subsequent request to get the next result page. It's returned in a paginated request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.apprunnerMod.NextToken] = js.undefined
  
  /**
    * A list of summary information records for observability configurations. In a paginated request, the request returns up to MaxResults records for each call.
    */
  var ObservabilityConfigurationSummaryList: typings.awsSdk.apprunnerMod.ObservabilityConfigurationSummaryList
}
object ListObservabilityConfigurationsResponse {
  
  inline def apply(ObservabilityConfigurationSummaryList: ObservabilityConfigurationSummaryList): ListObservabilityConfigurationsResponse = {
    val __obj = js.Dynamic.literal(ObservabilityConfigurationSummaryList = ObservabilityConfigurationSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObservabilityConfigurationsResponse]
  }
  
  extension [Self <: ListObservabilityConfigurationsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setObservabilityConfigurationSummaryList(value: ObservabilityConfigurationSummaryList): Self = StObject.set(x, "ObservabilityConfigurationSummaryList", value.asInstanceOf[js.Any])
    
    inline def setObservabilityConfigurationSummaryListVarargs(value: ObservabilityConfigurationSummary*): Self = StObject.set(x, "ObservabilityConfigurationSummaryList", js.Array(value*))
  }
}
