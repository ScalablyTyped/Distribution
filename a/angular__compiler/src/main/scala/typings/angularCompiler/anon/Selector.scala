package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selector extends StObject {
  
  var expression: js.Any = js.native
  
  var selector: String = js.native
}
object Selector {
  
  @scala.inline
  def apply(expression: js.Any, selector: String): Selector = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  implicit class SelectorMutableBuilder[Self <: Selector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: js.Any): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
