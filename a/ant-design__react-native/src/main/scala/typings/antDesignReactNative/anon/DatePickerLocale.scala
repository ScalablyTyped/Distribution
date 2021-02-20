package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerLocale extends StObject {
  
  var DatePickerLocale: Am = js.native
  
  var dismissText: String = js.native
  
  var extra: String = js.native
  
  var okText: String = js.native
}
object DatePickerLocale {
  
  @scala.inline
  def apply(DatePickerLocale: Am, dismissText: String, extra: String, okText: String): DatePickerLocale = {
    val __obj = js.Dynamic.literal(DatePickerLocale = DatePickerLocale.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerLocale]
  }
  
  @scala.inline
  implicit class DatePickerLocaleMutableBuilder[Self <: DatePickerLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatePickerLocale(value: Am): Self = StObject.set(x, "DatePickerLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissText(value: String): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
  }
}
