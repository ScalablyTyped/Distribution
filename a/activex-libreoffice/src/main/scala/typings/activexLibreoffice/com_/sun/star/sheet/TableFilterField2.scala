package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a single condition in a filter descriptor.
  *
  * This struct has the {@link FilterOperator2} constants group as member, whereas the {@link TableFilterField} struct uses the FilterOperator enum.
  * @see SheetFilterDescriptor
  * @since OOo 3.2
  */
@js.native
trait TableFilterField2 extends StObject {
  
  /** specifies how the condition is connected to the previous condition. */
  var Connection: FilterConnection = js.native
  
  /** specifies which field (column) is used for the condition. */
  var Field: Double = js.native
  
  /** selects whether the {@link TableFilterField2.NumericValue} or the {@link TableFilterField2.StringValue} is used. */
  var IsNumeric: Boolean = js.native
  
  /** specifies a numeric value for the condition. */
  var NumericValue: Double = js.native
  
  /** specifies the type of the condition as defined in {@link FilterOperator2} . */
  var Operator: Double = js.native
  
  /** specifies a string value for the condition. */
  var StringValue: String = js.native
}
object TableFilterField2 {
  
  @scala.inline
  def apply(
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
  implicit class TableFilterField2MutableBuilder[Self <: TableFilterField2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: FilterConnection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: Double): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNumeric(value: Boolean): Self = StObject.set(x, "IsNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericValue(value: Double): Self = StObject.set(x, "NumericValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: Double): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
  }
}
