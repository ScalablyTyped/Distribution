package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceLineDynamicDataConfiguration extends StObject {
  
  /**
    * The calculation that is used in the dynamic data.
    */
  var Calculation: NumericalAggregationFunction
  
  /**
    * The column that the dynamic data targets.
    */
  var Column: ColumnIdentifier
  
  /**
    * The aggregation function that is used in the dynamic data.
    */
  var MeasureAggregationFunction: js.UndefOr[AggregationFunction] = js.undefined
}
object ReferenceLineDynamicDataConfiguration {
  
  inline def apply(Calculation: NumericalAggregationFunction, Column: ColumnIdentifier): ReferenceLineDynamicDataConfiguration = {
    val __obj = js.Dynamic.literal(Calculation = Calculation.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceLineDynamicDataConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceLineDynamicDataConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCalculation(value: NumericalAggregationFunction): Self = StObject.set(x, "Calculation", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setMeasureAggregationFunction(value: AggregationFunction): Self = StObject.set(x, "MeasureAggregationFunction", value.asInstanceOf[js.Any])
    
    inline def setMeasureAggregationFunctionUndefined: Self = StObject.set(x, "MeasureAggregationFunction", js.undefined)
  }
}
