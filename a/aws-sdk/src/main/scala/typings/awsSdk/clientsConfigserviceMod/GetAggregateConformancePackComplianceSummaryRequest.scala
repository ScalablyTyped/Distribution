package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAggregateConformancePackComplianceSummaryRequest extends StObject {
  
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsSdk.clientsConfigserviceMod.ConfigurationAggregatorName
  
  /**
    * Filters the results based on the AggregateConformancePackComplianceSummaryFilters object.
    */
  var Filters: js.UndefOr[AggregateConformancePackComplianceSummaryFilters] = js.undefined
  
  /**
    * Groups the result based on Amazon Web Services account ID or Amazon Web Services Region.
    */
  var GroupByKey: js.UndefOr[AggregateConformancePackComplianceSummaryGroupKey] = js.undefined
  
  /**
    * The maximum number of results returned on each page. The default is maximum. If you specify 0, Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.Limit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
}
object GetAggregateConformancePackComplianceSummaryRequest {
  
  inline def apply(ConfigurationAggregatorName: ConfigurationAggregatorName): GetAggregateConformancePackComplianceSummaryRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateConformancePackComplianceSummaryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAggregateConformancePackComplianceSummaryRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = StObject.set(x, "ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: AggregateConformancePackComplianceSummaryFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setGroupByKey(value: AggregateConformancePackComplianceSummaryGroupKey): Self = StObject.set(x, "GroupByKey", value.asInstanceOf[js.Any])
    
    inline def setGroupByKeyUndefined: Self = StObject.set(x, "GroupByKey", js.undefined)
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
