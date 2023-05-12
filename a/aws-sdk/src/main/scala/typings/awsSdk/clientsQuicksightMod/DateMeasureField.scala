package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateMeasureField extends StObject {
  
  /**
    * The aggregation function of the measure field.
    */
  var AggregationFunction: js.UndefOr[DateAggregationFunction] = js.undefined
  
  /**
    * The column that is used in the DateMeasureField.
    */
  var Column: ColumnIdentifier
  
  /**
    * The custom field ID.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The format configuration of the field.
    */
  var FormatConfiguration: js.UndefOr[DateTimeFormatConfiguration] = js.undefined
}
object DateMeasureField {
  
  inline def apply(Column: ColumnIdentifier, FieldId: FieldId): DateMeasureField = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateMeasureField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateMeasureField] (val x: Self) extends AnyVal {
    
    inline def setAggregationFunction(value: DateAggregationFunction): Self = StObject.set(x, "AggregationFunction", value.asInstanceOf[js.Any])
    
    inline def setAggregationFunctionUndefined: Self = StObject.set(x, "AggregationFunction", js.undefined)
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setFormatConfiguration(value: DateTimeFormatConfiguration): Self = StObject.set(x, "FormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFormatConfigurationUndefined: Self = StObject.set(x, "FormatConfiguration", js.undefined)
  }
}
