package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObservabilityConfigurationsRequest extends StObject {
  
  /**
    * Set to true to list only the latest revision for each requested configuration name. Set to false to list all revisions for each requested configuration name. Default: true 
    */
  var LatestOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of results to include in each response (result page). It's used for a paginated request. If you don't specify MaxResults, the request retrieves all available results in a single response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsApprunnerMod.MaxResults] = js.undefined
  
  /**
    * A token from a previous result page. It's used for a paginated request. The request retrieves the next result page. All other parameter values must be identical to the ones that are specified in the initial request. If you don't specify NextToken, the request retrieves the first result page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsApprunnerMod.NextToken] = js.undefined
  
  /**
    * The name of the App Runner observability configuration that you want to list. If specified, App Runner lists revisions that share this name. If not specified, App Runner returns revisions of all active configurations.
    */
  var ObservabilityConfigurationName: js.UndefOr[typings.awsSdk.clientsApprunnerMod.ObservabilityConfigurationName] = js.undefined
}
object ListObservabilityConfigurationsRequest {
  
  inline def apply(): ListObservabilityConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObservabilityConfigurationsRequest]
  }
  
  extension [Self <: ListObservabilityConfigurationsRequest](x: Self) {
    
    inline def setLatestOnly(value: Boolean): Self = StObject.set(x, "LatestOnly", value.asInstanceOf[js.Any])
    
    inline def setLatestOnlyUndefined: Self = StObject.set(x, "LatestOnly", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setObservabilityConfigurationName(value: ObservabilityConfigurationName): Self = StObject.set(x, "ObservabilityConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setObservabilityConfigurationNameUndefined: Self = StObject.set(x, "ObservabilityConfigurationName", js.undefined)
  }
}
