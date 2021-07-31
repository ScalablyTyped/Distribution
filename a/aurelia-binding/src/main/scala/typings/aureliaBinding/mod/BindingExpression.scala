package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingExpression extends StObject {
  
  def createBinding(target: js.Any): Binding
}
object BindingExpression {
  
  @scala.inline
  def apply(createBinding: js.Any => Binding): BindingExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction1(createBinding))
    __obj.asInstanceOf[BindingExpression]
  }
  
  @scala.inline
  implicit class BindingExpressionMutableBuilder[Self <: BindingExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateBinding(value: js.Any => Binding): Self = StObject.set(x, "createBinding", js.Any.fromFunction1(value))
  }
}
