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
trait TableFilterField2 extends js.Object {
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
}

