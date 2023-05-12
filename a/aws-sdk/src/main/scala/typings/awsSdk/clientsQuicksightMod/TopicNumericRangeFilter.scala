package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicNumericRangeFilter extends StObject {
  
  /**
    * An aggregation function that specifies how to calculate the value of a numeric field for a topic, Valid values for this structure are NO_AGGREGATION, SUM, AVERAGE, COUNT, DISTINCT_COUNT, MAX, MEDIAN, MIN, STDEV, STDEVP, VAR, and VARP.
    */
  var Aggregation: js.UndefOr[NamedFilterAggType] = js.undefined
  
  /**
    * The constant used in a numeric range filter.
    */
  var Constant: js.UndefOr[TopicRangeFilterConstant] = js.undefined
  
  /**
    * A Boolean value that indicates whether the endpoints of the numeric range are included in the filter. If set to true, topics whose numeric field value is equal to the endpoint values will be included in the filter. If set to false, topics whose numeric field value is equal to the endpoint values will be excluded from the filter.
    */
  var Inclusive: js.UndefOr[Boolean] = js.undefined
}
object TopicNumericRangeFilter {
  
  inline def apply(): TopicNumericRangeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicNumericRangeFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicNumericRangeFilter] (val x: Self) extends AnyVal {
    
    inline def setAggregation(value: NamedFilterAggType): Self = StObject.set(x, "Aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "Aggregation", js.undefined)
    
    inline def setConstant(value: TopicRangeFilterConstant): Self = StObject.set(x, "Constant", value.asInstanceOf[js.Any])
    
    inline def setConstantUndefined: Self = StObject.set(x, "Constant", js.undefined)
    
    inline def setInclusive(value: Boolean): Self = StObject.set(x, "Inclusive", value.asInstanceOf[js.Any])
    
    inline def setInclusiveUndefined: Self = StObject.set(x, "Inclusive", js.undefined)
  }
}
