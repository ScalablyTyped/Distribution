package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoricalMeasureField extends StObject {
  
  /**
    * The aggregation function of the measure field.
    */
  var AggregationFunction: js.UndefOr[CategoricalAggregationFunction] = js.undefined
  
  /**
    * The column that is used in the CategoricalMeasureField.
    */
  var Column: ColumnIdentifier
  
  /**
    * The custom field ID.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The format configuration of the field.
    */
  var FormatConfiguration: js.UndefOr[StringFormatConfiguration] = js.undefined
}
object CategoricalMeasureField {
  
  inline def apply(Column: ColumnIdentifier, FieldId: FieldId): CategoricalMeasureField = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoricalMeasureField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoricalMeasureField] (val x: Self) extends AnyVal {
    
    inline def setAggregationFunction(value: CategoricalAggregationFunction): Self = StObject.set(x, "AggregationFunction", value.asInstanceOf[js.Any])
    
    inline def setAggregationFunctionUndefined: Self = StObject.set(x, "AggregationFunction", js.undefined)
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setFormatConfiguration(value: StringFormatConfiguration): Self = StObject.set(x, "FormatConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFormatConfigurationUndefined: Self = StObject.set(x, "FormatConfiguration", js.undefined)
  }
}
