package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgValue extends StObject {
  
  var ngValue: "ngValue"
  
  var value: "value"
}
object NgValue {
  
  inline def apply(): NgValue = {
    val __obj = js.Dynamic.literal(ngValue = "ngValue", value = "value")
    __obj.asInstanceOf[NgValue]
  }
  
  extension [Self <: NgValue](x: Self) {
    
    inline def setNgValue(value: "ngValue"): Self = StObject.set(x, "ngValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: "value"): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
