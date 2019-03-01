package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 3.5 */
trait FilterFieldValue extends js.Object {
  /** selects whether the TableFilterFieldValue::NumericValue or the TableFilterFieldValue::StringValue is used. */
  var IsNumeric: scala.Boolean
  /** specifies a numeric value for the condition. */
  var NumericValue: scala.Double
  /** specifies a string value for the condition. */
  var StringValue: java.lang.String
}

object FilterFieldValue {
  @scala.inline
  def apply(IsNumeric: scala.Boolean, NumericValue: scala.Double, StringValue: java.lang.String): FilterFieldValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IsNumeric")(IsNumeric)
    __obj.updateDynamic("NumericValue")(NumericValue)
    __obj.updateDynamic("StringValue")(StringValue)
    __obj.asInstanceOf[FilterFieldValue]
  }
}

