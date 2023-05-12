package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicNumericEqualityFilter extends StObject {
  
  /**
    * An aggregation function that specifies how to calculate the value of a numeric field for a topic. Valid values for this structure are NO_AGGREGATION, SUM, AVERAGE, COUNT, DISTINCT_COUNT, MAX, MEDIAN, MIN, STDEV, STDEVP, VAR, and VARP.
    */
  var Aggregation: js.UndefOr[NamedFilterAggType] = js.undefined
  
  /**
    * The constant used in a numeric equality filter.
    */
  var Constant: js.UndefOr[TopicSingularFilterConstant] = js.undefined
}
object TopicNumericEqualityFilter {
  
  inline def apply(): TopicNumericEqualityFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicNumericEqualityFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicNumericEqualityFilter] (val x: Self) extends AnyVal {
    
    inline def setAggregation(value: NamedFilterAggType): Self = StObject.set(x, "Aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "Aggregation", js.undefined)
    
    inline def setConstant(value: TopicSingularFilterConstant): Self = StObject.set(x, "Constant", value.asInstanceOf[js.Any])
    
    inline def setConstantUndefined: Self = StObject.set(x, "Constant", js.undefined)
  }
}
