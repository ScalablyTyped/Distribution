package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AntLocaleDatePickerView extends StObject {
  
  var antLocale: DatePickerView
}
object AntLocaleDatePickerView {
  
  inline def apply(antLocale: DatePickerView): AntLocaleDatePickerView = {
    val __obj = js.Dynamic.literal(antLocale = antLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntLocaleDatePickerView]
  }
  
  extension [Self <: AntLocaleDatePickerView](x: Self) {
    
    inline def setAntLocale(value: DatePickerView): Self = StObject.set(x, "antLocale", value.asInstanceOf[js.Any])
  }
}
