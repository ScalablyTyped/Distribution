package typings.angularCore.anon

import typings.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directive extends StObject {
  
  var directive: Type[Any]
  
  var inputs: js.UndefOr[js.Array[String]] = js.undefined
  
  var outputs: js.UndefOr[js.Array[String]] = js.undefined
}
object Directive {
  
  inline def apply(directive: Type[Any]): Directive = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Directive] (val x: Self) extends AnyVal {
    
    inline def setDirective(value: Type[Any]): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value*))
  }
}
