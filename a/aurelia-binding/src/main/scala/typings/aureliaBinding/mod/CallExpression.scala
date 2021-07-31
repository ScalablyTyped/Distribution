package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallExpression extends StObject {
  
  def createBinding(target: js.Any): Binding
}
object CallExpression {
  
  @scala.inline
  def apply(createBinding: js.Any => Binding): CallExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction1(createBinding))
    __obj.asInstanceOf[CallExpression]
  }
  
  @scala.inline
  implicit class CallExpressionMutableBuilder[Self <: CallExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateBinding(value: js.Any => Binding): Self = StObject.set(x, "createBinding", js.Any.fromFunction1(value))
  }
}
