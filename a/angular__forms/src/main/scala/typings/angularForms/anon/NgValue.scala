package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgValue extends StObject {
  
  var ngValue: `15`
  
  var value: `16`
}
object NgValue {
  
  inline def apply(ngValue: `15`, value: `16`): NgValue = {
    val __obj = js.Dynamic.literal(ngValue = ngValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgValue] (val x: Self) extends AnyVal {
    
    inline def setNgValue(value: `15`): Self = StObject.set(x, "ngValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `16`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
