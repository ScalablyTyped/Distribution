package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavingsPlansUtilizationRequest extends StObject {
  
  /**
    * Filters Savings Plans utilization coverage data for active Savings Plans dimensions. You can filter data with the following dimensions:    LINKED_ACCOUNT     SAVINGS_PLAN_ARN     SAVINGS_PLANS_TYPE     REGION     PAYMENT_OPTION     INSTANCE_TYPE_FAMILY     GetSavingsPlansUtilization uses the same Expression object as the other operations, but only AND is supported among each dimension.
    */
  var Filter: js.UndefOr[Expression] = js.undefined
  
  /**
    * The granularity of the Amazon Web Services utillization data for your Savings Plans. The GetSavingsPlansUtilization operation supports only DAILY and MONTHLY granularities.
    */
  var Granularity: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.Granularity] = js.undefined
  
  /**
    * The value that you want to sort the data by. The following values are supported for Key:    UtilizationPercentage     TotalCommitment     UsedCommitment     UnusedCommitment     NetSavings    The supported values for SortOrder are ASCENDING and DESCENDING.
    */
  var SortBy: js.UndefOr[SortDefinition] = js.undefined
  
  /**
    * The time period that you want the usage and costs for. The Start date must be within 13 months. The End date must be after the Start date, and before the current date. Future dates can't be used as an End date.
    */
  var TimePeriod: DateInterval
}
object GetSavingsPlansUtilizationRequest {
  
  inline def apply(TimePeriod: DateInterval): GetSavingsPlansUtilizationRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavingsPlansUtilizationRequest]
  }
  
  extension [Self <: GetSavingsPlansUtilizationRequest](x: Self) {
    
    inline def setFilter(value: Expression): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setGranularity(value: Granularity): Self = StObject.set(x, "Granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "Granularity", js.undefined)
    
    inline def setSortBy(value: SortDefinition): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
  }
}
