package typings.activexLibreoffice.com_.sun.star.sheet

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 3.5 */
trait TableFilterField3 extends js.Object {
  /** specifies how the condition is connected to the previous condition. */
  var Connection: FilterConnection
  /** specifies which field (column) is used for the condition. */
  var Field: Double
  /** specifies the type of the condition as defined in {@link FilterOperator2} . */
  var Operator: Double
  /** specifies values to match against. Each filter field may have one or more values. */
  var Values: SafeArray[FilterFieldValue]
}

object TableFilterField3 {
  @scala.inline
  def apply(Connection: FilterConnection, Field: Double, Operator: Double, Values: SafeArray[FilterFieldValue]): TableFilterField3 = {
    val __obj = js.Dynamic.literal(Connection = Connection.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableFilterField3]
  }
}

