package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 3.5 */
@js.native
trait FilterFieldValue extends js.Object {
  /** selects whether the TableFilterFieldValue::NumericValue or the TableFilterFieldValue::StringValue is used. */
  var IsNumeric: Boolean = js.native
  /** specifies a numeric value for the condition. */
  var NumericValue: Double = js.native
  /** specifies a string value for the condition. */
  var StringValue: String = js.native
}

object FilterFieldValue {
  @scala.inline
  def apply(IsNumeric: Boolean, NumericValue: Double, StringValue: String): FilterFieldValue = {
    val __obj = js.Dynamic.literal(IsNumeric = IsNumeric.asInstanceOf[js.Any], NumericValue = NumericValue.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterFieldValue]
  }
  @scala.inline
  implicit class FilterFieldValueOps[Self <: FilterFieldValue] (val x: Self) extends AnyVal {
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
    def setIsNumeric(value: Boolean): Self = this.set("IsNumeric", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumericValue(value: Double): Self = this.set("NumericValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringValue(value: String): Self = this.set("StringValue", value.asInstanceOf[js.Any])
  }
  
}

