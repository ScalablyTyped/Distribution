package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericalMeasureField extends StObject {
  
  /**
    * The aggregation function of the measure field.
    */
  var AggregationFunction: js.UndefOr[NumericalAggregationFunction] = js.undefined
  
  /**
    * The column that is used in the NumericalMeasureField.
    */
  var Column: ColumnIdentifier
  
  /**
    * The custom field ID.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The format configuration of the field.
    */
  var FormatConfiguration: js.UndefOr[NumberFormatConfiguration] = js.undefined
}
object NumericalMeasureField {
  
  inline def apply(Column: ColumnIdentifier, FieldId: FieldId): NumericalMeasureField = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericalMeasureField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericalMeasureField] (val x: Self) extends AnyVal {
    
    inline def setAggregationFunction(value: NumericalAggregationFunction): Self = StObject.set(x, "AggregationFunction", value.asInstanceOf[js.Any])
    
    inline def setAggregationFunctionUndefined: Self = StObject.set(x, "AggregationFunction", js.undefined)
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setFormatConfiguration(value: NumberFormatConfiguration): Self = StObject.set(x, "FormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFormatConfigurationUndefined: Self = StObject.set(x, "FormatConfiguration", js.undefined)
  }
}
