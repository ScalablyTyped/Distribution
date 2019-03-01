package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

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
  var Field: scala.Double
  /** selects whether the {@link TableFilterField2.NumericValue} or the {@link TableFilterField2.StringValue} is used. */
  var IsNumeric: scala.Boolean
  /** specifies a numeric value for the condition. */
  var NumericValue: scala.Double
  /** specifies the type of the condition as defined in {@link FilterOperator2} . */
  var Operator: scala.Double
  /** specifies a string value for the condition. */
  var StringValue: java.lang.String
}

object TableFilterField2 {
  @scala.inline
  def apply(
    Connection: FilterConnection,
    Field: scala.Double,
    IsNumeric: scala.Boolean,
    NumericValue: scala.Double,
    Operator: scala.Double,
    StringValue: java.lang.String
  ): TableFilterField2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Connection")(Connection)
    __obj.updateDynamic("Field")(Field)
    __obj.updateDynamic("IsNumeric")(IsNumeric)
    __obj.updateDynamic("NumericValue")(NumericValue)
    __obj.updateDynamic("Operator")(Operator)
    __obj.updateDynamic("StringValue")(StringValue)
    __obj.asInstanceOf[TableFilterField2]
  }
}

