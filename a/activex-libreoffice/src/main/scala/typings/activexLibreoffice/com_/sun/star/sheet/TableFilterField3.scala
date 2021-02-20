package typings.activexLibreoffice.com_.sun.star.sheet

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 3.5 */
@js.native
trait TableFilterField3 extends StObject {
  
  /** specifies how the condition is connected to the previous condition. */
  var Connection: FilterConnection = js.native
  
  /** specifies which field (column) is used for the condition. */
  var Field: Double = js.native
  
  /** specifies the type of the condition as defined in {@link FilterOperator2} . */
  var Operator: Double = js.native
  
  /** specifies values to match against. Each filter field may have one or more values. */
  var Values: SafeArray[FilterFieldValue] = js.native
}
object TableFilterField3 {
  
  @scala.inline
  def apply(Connection: FilterConnection, Field: Double, Operator: Double, Values: SafeArray[FilterFieldValue]): TableFilterField3 = {
    val __obj = js.Dynamic.literal(Connection = Connection.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableFilterField3]
  }
  
  @scala.inline
  implicit class TableFilterField3MutableBuilder[Self <: TableFilterField3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: FilterConnection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: Double): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: Double): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: SafeArray[FilterFieldValue]): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
  }
}
