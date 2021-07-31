package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AntLocaleDatePickerView extends StObject {
  
  var antLocale: DatePickerView
}
object AntLocaleDatePickerView {
  
  @scala.inline
  def apply(antLocale: DatePickerView): AntLocaleDatePickerView = {
    val __obj = js.Dynamic.literal(antLocale = antLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntLocaleDatePickerView]
  }
  
  @scala.inline
  implicit class AntLocaleDatePickerViewMutableBuilder[Self <: AntLocaleDatePickerView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntLocale(value: DatePickerView): Self = StObject.set(x, "antLocale", value.asInstanceOf[js.Any])
  }
}
