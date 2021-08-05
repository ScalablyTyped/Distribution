package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AntLocaleDatePicker extends StObject {
  
  var antLocale: DatePicker
}
object AntLocaleDatePicker {
  
  inline def apply(antLocale: DatePicker): AntLocaleDatePicker = {
    val __obj = js.Dynamic.literal(antLocale = antLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntLocaleDatePicker]
  }
  
  extension [Self <: AntLocaleDatePicker](x: Self) {
    
    inline def setAntLocale(value: DatePicker): Self = StObject.set(x, "antLocale", value.asInstanceOf[js.Any])
  }
}
