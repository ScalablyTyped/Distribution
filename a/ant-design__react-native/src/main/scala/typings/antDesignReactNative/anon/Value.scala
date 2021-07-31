package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var value: Unit
  
  var value12hours: Unit
}
object Value {
  
  @scala.inline
  def apply(value: Unit, value12hours: Unit): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], value12hours = value12hours.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue12hours(value: Unit): Self = StObject.set(x, "value12hours", value.asInstanceOf[js.Any])
  }
}
