package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupFunctions extends StObject {
  
  def bindingBehaviors(name: String): js.Any
  
  def valueConverters(name: String): js.Any
}
object LookupFunctions {
  
  inline def apply(bindingBehaviors: String => js.Any, valueConverters: String => js.Any): LookupFunctions = {
    val __obj = js.Dynamic.literal(bindingBehaviors = js.Any.fromFunction1(bindingBehaviors), valueConverters = js.Any.fromFunction1(valueConverters))
    __obj.asInstanceOf[LookupFunctions]
  }
  
  extension [Self <: LookupFunctions](x: Self) {
    
    inline def setBindingBehaviors(value: String => js.Any): Self = StObject.set(x, "bindingBehaviors", js.Any.fromFunction1(value))
    
    inline def setValueConverters(value: String => js.Any): Self = StObject.set(x, "valueConverters", js.Any.fromFunction1(value))
  }
}
