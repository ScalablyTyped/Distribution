package typings.activexLibreoffice.com_.sun.star.sheet

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 3.5 */
@js.native
trait TableFilterField3 extends js.Object {
  
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
  implicit class TableFilterField3Ops[Self <: TableFilterField3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnection(value: FilterConnection): Self = this.set("Connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: Double): Self = this.set("Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: Double): Self = this.set("Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: SafeArray[FilterFieldValue]): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
}
