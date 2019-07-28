package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 3.5 */
trait FilterFieldValue extends js.Object {
  /** selects whether the TableFilterFieldValue::NumericValue or the TableFilterFieldValue::StringValue is used. */
  var IsNumeric: Boolean
  /** specifies a numeric value for the condition. */
  var NumericValue: Double
  /** specifies a string value for the condition. */
  var StringValue: String
}

object FilterFieldValue {
  @scala.inline
  def apply(IsNumeric: Boolean, NumericValue: Double, StringValue: String): FilterFieldValue = {
    val __obj = js.Dynamic.literal(IsNumeric = IsNumeric, NumericValue = NumericValue, StringValue = StringValue)
  
    __obj.asInstanceOf[FilterFieldValue]
  }
}

