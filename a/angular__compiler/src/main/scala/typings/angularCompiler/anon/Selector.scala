package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selector extends StObject {
  
  var expression: js.Any
  
  var selector: String
}
object Selector {
  
  inline def apply(expression: js.Any, selector: String): Selector = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  extension [Self <: Selector](x: Self) {
    
    inline def setExpression(value: js.Any): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
