package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a single condition in a filter descriptor.
  *
  * This struct has the {@link FilterOperator2} constants group as member, whereas the {@link TableFilterField} struct uses the FilterOperator enum.
  * @see SheetFilterDescriptor
  * @since OOo 3.2
  */
trait TableFilterField2 extends StObject {
  
  /** specifies how the condition is connected to the previous condition. */
  var Connection: FilterConnection
  
  /** specifies which field (column) is used for the condition. */
  var Field: Double
  
  /** selects whether the {@link TableFilterField2.NumericValue} or the {@link TableFilterField2.StringValue} is used. */
  var IsNumeric: Boolean
  
  /** specifies a numeric value for the condition. */
  var NumericValue: Double
  
  /** specifies the type of the condition as defined in {@link FilterOperator2} . */
  var Operator: Double
  
  /** specifies a string value for the condition. */
  var StringValue: String
}
object TableFilterField2 {
  
  inline def apply(
    Connection: FilterConnection,
    Field: Double,
    IsNumeric: Boolean,
    NumericValue: Double,
    Operator: Double,
    StringValue: String
  ): TableFilterField2 = {
    val __obj = js.Dynamic.literal(Connection = Connection.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], IsNumeric = IsNumeric.asInstanceOf[js.Any], NumericValue = NumericValue.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableFilterField2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableFilterField2] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: FilterConnection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    inline def setField(value: Double): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    inline def setIsNumeric(value: Boolean): Self = StObject.set(x, "IsNumeric", value.asInstanceOf[js.Any])
    
    inline def setNumericValue(value: Double): Self = StObject.set(x, "NumericValue", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: Double): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
  }
}
