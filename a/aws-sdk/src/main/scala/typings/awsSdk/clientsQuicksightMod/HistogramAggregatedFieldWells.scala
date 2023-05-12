package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramAggregatedFieldWells extends StObject {
  
  /**
    * The value field wells of a histogram. Values are aggregated by COUNT or DISTINCT_COUNT.
    */
  var Values: js.UndefOr[HistogramMeasureFieldList] = js.undefined
}
object HistogramAggregatedFieldWells {
  
  inline def apply(): HistogramAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistogramAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setValues(value: HistogramMeasureFieldList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MeasureField*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
