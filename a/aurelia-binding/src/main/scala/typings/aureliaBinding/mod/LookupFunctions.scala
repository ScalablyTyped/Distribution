package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupFunctions extends StObject {
  
  def bindingBehaviors(name: String): Any
  
  def valueConverters(name: String): Any
}
object LookupFunctions {
  
  inline def apply(bindingBehaviors: String => Any, valueConverters: String => Any): LookupFunctions = {
    val __obj = js.Dynamic.literal(bindingBehaviors = js.Any.fromFunction1(bindingBehaviors), valueConverters = js.Any.fromFunction1(valueConverters))
    __obj.asInstanceOf[LookupFunctions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LookupFunctions] (val x: Self) extends AnyVal {
    
    inline def setBindingBehaviors(value: String => Any): Self = StObject.set(x, "bindingBehaviors", js.Any.fromFunction1(value))
    
    inline def setValueConverters(value: String => Any): Self = StObject.set(x, "valueConverters", js.Any.fromFunction1(value))
  }
}
