package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavingsPlansCoverageRequest extends StObject {
  
  /**
    * Filters Savings Plans coverage data by dimensions. You can filter data for Savings Plans usage with the following dimensions:    LINKED_ACCOUNT     REGION     SERVICE     INSTANCE_FAMILY     GetSavingsPlansCoverage uses the same Expression object as the other operations, but only AND is supported among each dimension. If there are multiple values for a dimension, they are OR'd together. Cost category is also supported.
    */
  var Filter: js.UndefOr[Expression] = js.undefined
  
  /**
    * The granularity of the Amazon Web Services cost data for your Savings Plans. Granularity can't be set if GroupBy is set. The GetSavingsPlansCoverage operation supports only DAILY and MONTHLY granularities.
    */
  var Granularity: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.Granularity] = js.undefined
  
  /**
    * You can group the data using the attributes INSTANCE_FAMILY, REGION, or SERVICE.
    */
  var GroupBy: js.UndefOr[GroupDefinitions] = js.undefined
  
  /**
    * The number of items to be returned in a response. The default is 20, with a minimum value of 1.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.MaxResults] = js.undefined
  
  /**
    * The measurement that you want your Savings Plans coverage reported in. The only valid value is SpendCoveredBySavingsPlans.
    */
  var Metrics: js.UndefOr[MetricNames] = js.undefined
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextToken: js.UndefOr[NextPageToken] = js.undefined
  
  /**
    * The value that you want to sort the data by. The following values are supported for Key:    SpendCoveredBySavingsPlan     OnDemandCost     CoveragePercentage     TotalCost     InstanceFamily     Region     Service    The supported values for SortOrder are ASCENDING and DESCENDING.
    */
  var SortBy: js.UndefOr[SortDefinition] = js.undefined
  
  /**
    * The time period that you want the usage and costs for. The Start date must be within 13 months. The End date must be after the Start date, and before the current date. Future dates can't be used as an End date.
    */
  var TimePeriod: DateInterval
}
object GetSavingsPlansCoverageRequest {
  
  inline def apply(TimePeriod: DateInterval): GetSavingsPlansCoverageRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansCoverageRequest]
  }
  
  extension [Self <: GetSavingsPlansCoverageRequest](x: Self) {
    
    inline def setFilter(value: Expression): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setGranularity(value: Granularity): Self = StObject.set(x, "Granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "Granularity", js.undefined)
    
    inline def setGroupBy(value: GroupDefinitions): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByUndefined: Self = StObject.set(x, "GroupBy", js.undefined)
    
    inline def setGroupByVarargs(value: GroupDefinition*): Self = StObject.set(x, "GroupBy", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMetrics(value: MetricNames): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setMetricsVarargs(value: MetricName*): Self = StObject.set(x, "Metrics", js.Array(value*))
    
    inline def setNextToken(value: NextPageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: SortDefinition): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
  }
}
