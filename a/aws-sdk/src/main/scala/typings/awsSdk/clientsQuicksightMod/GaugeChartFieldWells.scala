package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaugeChartFieldWells extends StObject {
  
  /**
    * The target value field wells of a GaugeChartVisual.
    */
  var TargetValues: js.UndefOr[MeasureFieldList] = js.undefined
  
  /**
    * The value field wells of a GaugeChartVisual.
    */
  var Values: js.UndefOr[MeasureFieldList] = js.undefined
}
object GaugeChartFieldWells {
  
  inline def apply(): GaugeChartFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaugeChartFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GaugeChartFieldWells] (val x: Self) extends AnyVal {
    
    inline def setTargetValues(value: MeasureFieldList): Self = StObject.set(x, "TargetValues", value.asInstanceOf[js.Any])
    
    inline def setTargetValuesUndefined: Self = StObject.set(x, "TargetValues", js.undefined)
    
    inline def setTargetValuesVarargs(value: MeasureField*): Self = StObject.set(x, "TargetValues", js.Array(value*))
    
    inline def setValues(value: MeasureFieldList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MeasureField*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
