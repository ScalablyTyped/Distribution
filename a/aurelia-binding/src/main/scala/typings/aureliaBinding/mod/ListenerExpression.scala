package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerExpression extends StObject {
  
  def createBinding(target: Any): Binding
}
object ListenerExpression {
  
  inline def apply(createBinding: Any => Binding): ListenerExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction1(createBinding))
    __obj.asInstanceOf[ListenerExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListenerExpression] (val x: Self) extends AnyVal {
    
    inline def setCreateBinding(value: Any => Binding): Self = StObject.set(x, "createBinding", js.Any.fromFunction1(value))
  }
}
