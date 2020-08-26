package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a single condition in a filter descriptor.
  *
  * This struct has the {@link FilterOperator2} constants group as member, whereas the {@link TableFilterField} struct uses the FilterOperator enum.
  * @see SheetFilterDescriptor
  * @since OOo 3.2
  */
@js.native
trait TableFilterField2 extends js.Object {
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
  implicit class TableFilterField2Ops[Self <: TableFilterField2] (val x: Self) extends AnyVal {
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
    def setIsNumeric(value: Boolean): Self = this.set("IsNumeric", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumericValue(value: Double): Self = this.set("NumericValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: Double): Self = this.set("Operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringValue(value: String): Self = this.set("StringValue", value.asInstanceOf[js.Any])
  }
  
}

