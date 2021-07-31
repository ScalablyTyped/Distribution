package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetExpression extends StObject {
  
  def createBinding(): LetBinding
}
object LetExpression {
  
  @scala.inline
  def apply(createBinding: () => LetBinding): LetExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction0(createBinding))
    __obj.asInstanceOf[LetExpression]
  }
  
  @scala.inline
  implicit class LetExpressionMutableBuilder[Self <: LetExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateBinding(value: () => LetBinding): Self = StObject.set(x, "createBinding", js.Any.fromFunction0(value))
  }
}
