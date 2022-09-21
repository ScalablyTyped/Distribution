package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentPropertyChanged extends StObject {
  
  def propertyChanged(name: String, newValue: Any, oldValue: Any): Unit
}
object ComponentPropertyChanged {
  
  inline def apply(propertyChanged: (String, Any, Any) => Unit): ComponentPropertyChanged = {
    val __obj = js.Dynamic.literal(propertyChanged = js.Any.fromFunction3(propertyChanged))
    __obj.asInstanceOf[ComponentPropertyChanged]
  }
  
  extension [Self <: ComponentPropertyChanged](x: Self) {
    
    inline def setPropertyChanged(value: (String, Any, Any) => Unit): Self = StObject.set(x, "propertyChanged", js.Any.fromFunction3(value))
  }
}
