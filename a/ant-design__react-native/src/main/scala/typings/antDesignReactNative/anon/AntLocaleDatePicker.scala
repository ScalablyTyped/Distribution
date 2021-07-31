package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AntLocaleDatePicker extends StObject {
  
  var antLocale: DatePicker
}
object AntLocaleDatePicker {
  
  @scala.inline
  def apply(antLocale: DatePicker): AntLocaleDatePicker = {
    val __obj = js.Dynamic.literal(antLocale = antLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntLocaleDatePicker]
  }
  
  @scala.inline
  implicit class AntLocaleDatePickerMutableBuilder[Self <: AntLocaleDatePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntLocale(value: DatePicker): Self = StObject.set(x, "antLocale", value.asInstanceOf[js.Any])
  }
}
