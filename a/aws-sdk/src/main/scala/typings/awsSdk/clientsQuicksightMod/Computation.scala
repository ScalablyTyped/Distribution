package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Computation extends StObject {
  
  /**
    * The forecast computation configuration.
    */
  var Forecast: js.UndefOr[ForecastComputation] = js.undefined
  
  /**
    * The growth rate computation configuration.
    */
  var GrowthRate: js.UndefOr[GrowthRateComputation] = js.undefined
  
  /**
    * The maximum and minimum computation configuration.
    */
  var MaximumMinimum: js.UndefOr[MaximumMinimumComputation] = js.undefined
  
  /**
    * The metric comparison computation configuration.
    */
  var MetricComparison: js.UndefOr[MetricComparisonComputation] = js.undefined
  
  /**
    * The period over period computation configuration.
    */
  var PeriodOverPeriod: js.UndefOr[PeriodOverPeriodComputation] = js.undefined
  
  /**
    * The period to DataSetIdentifier computation configuration.
    */
  var PeriodToDate: js.UndefOr[PeriodToDateComputation] = js.undefined
  
  /**
    * The top movers and bottom movers computation configuration.
    */
  var TopBottomMovers: js.UndefOr[TopBottomMoversComputation] = js.undefined
  
  /**
    * The top ranked and bottom ranked computation configuration.
    */
  var TopBottomRanked: js.UndefOr[TopBottomRankedComputation] = js.undefined
  
  /**
    * The total aggregation computation configuration.
    */
  var TotalAggregation: js.UndefOr[TotalAggregationComputation] = js.undefined
  
  /**
    * The unique values computation configuration.
    */
  var UniqueValues: js.UndefOr[UniqueValuesComputation] = js.undefined
}
object Computation {
  
  inline def apply(): Computation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Computation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Computation] (val x: Self) extends AnyVal {
    
    inline def setForecast(value: ForecastComputation): Self = StObject.set(x, "Forecast", value.asInstanceOf[js.Any])
    
    inline def setForecastUndefined: Self = StObject.set(x, "Forecast", js.undefined)
    
    inline def setGrowthRate(value: GrowthRateComputation): Self = StObject.set(x, "GrowthRate", value.asInstanceOf[js.Any])
    
    inline def setGrowthRateUndefined: Self = StObject.set(x, "GrowthRate", js.undefined)
    
    inline def setMaximumMinimum(value: MaximumMinimumComputation): Self = StObject.set(x, "MaximumMinimum", value.asInstanceOf[js.Any])
    
    inline def setMaximumMinimumUndefined: Self = StObject.set(x, "MaximumMinimum", js.undefined)
    
    inline def setMetricComparison(value: MetricComparisonComputation): Self = StObject.set(x, "MetricComparison", value.asInstanceOf[js.Any])
    
    inline def setMetricComparisonUndefined: Self = StObject.set(x, "MetricComparison", js.undefined)
    
    inline def setPeriodOverPeriod(value: PeriodOverPeriodComputation): Self = StObject.set(x, "PeriodOverPeriod", value.asInstanceOf[js.Any])
    
    inline def setPeriodOverPeriodUndefined: Self = StObject.set(x, "PeriodOverPeriod", js.undefined)
    
    inline def setPeriodToDate(value: PeriodToDateComputation): Self = StObject.set(x, "PeriodToDate", value.asInstanceOf[js.Any])
    
    inline def setPeriodToDateUndefined: Self = StObject.set(x, "PeriodToDate", js.undefined)
    
    inline def setTopBottomMovers(value: TopBottomMoversComputation): Self = StObject.set(x, "TopBottomMovers", value.asInstanceOf[js.Any])
    
    inline def setTopBottomMoversUndefined: Self = StObject.set(x, "TopBottomMovers", js.undefined)
    
    inline def setTopBottomRanked(value: TopBottomRankedComputation): Self = StObject.set(x, "TopBottomRanked", value.asInstanceOf[js.Any])
    
    inline def setTopBottomRankedUndefined: Self = StObject.set(x, "TopBottomRanked", js.undefined)
    
    inline def setTotalAggregation(value: TotalAggregationComputation): Self = StObject.set(x, "TotalAggregation", value.asInstanceOf[js.Any])
    
    inline def setTotalAggregationUndefined: Self = StObject.set(x, "TotalAggregation", js.undefined)
    
    inline def setUniqueValues(value: UniqueValuesComputation): Self = StObject.set(x, "UniqueValues", value.asInstanceOf[js.Any])
    
    inline def setUniqueValuesUndefined: Self = StObject.set(x, "UniqueValues", js.undefined)
  }
}
