package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a single condition in a filter descriptor.
  * @see SheetFilterDescriptor
  */
trait TableFilterField extends js.Object {
  /** specifies how the condition is connected to the previous condition. */
  var Connection: FilterConnection
  /** specifies which field (column) is used for the condition. */
  var Field: scala.Double
  /** selects whether the {@link TableFilterField.NumericValue} or the {@link TableFilterField.StringValue} is used. */
  var IsNumeric: scala.Boolean
  /** specifies a numeric value for the condition. */
  var NumericValue: scala.Double
  /** specifies the type of the condition. */
  var Operator: FilterOperator
  /** specifies a string value for the condition. */
  var StringValue: java.lang.String
}

