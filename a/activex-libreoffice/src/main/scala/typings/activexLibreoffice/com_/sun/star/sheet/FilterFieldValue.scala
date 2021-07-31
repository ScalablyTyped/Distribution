package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 3.5 */
trait FilterFieldValue extends StObject {
  
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
    val __obj = js.Dynamic.literal(IsNumeric = IsNumeric.asInstanceOf[js.Any], NumericValue = NumericValue.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterFieldValue]
  }
  
  @scala.inline
  implicit class FilterFieldValueMutableBuilder[Self <: FilterFieldValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsNumeric(value: Boolean): Self = StObject.set(x, "IsNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericValue(value: Double): Self = StObject.set(x, "NumericValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
  }
}
