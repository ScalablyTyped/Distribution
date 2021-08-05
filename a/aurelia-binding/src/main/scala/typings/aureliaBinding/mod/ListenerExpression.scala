package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerExpression extends StObject {
  
  def createBinding(target: js.Any): Binding
}
object ListenerExpression {
  
  inline def apply(createBinding: js.Any => Binding): ListenerExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction1(createBinding))
    __obj.asInstanceOf[ListenerExpression]
  }
  
  extension [Self <: ListenerExpression](x: Self) {
    
    inline def setCreateBinding(value: js.Any => Binding): Self = StObject.set(x, "createBinding", js.Any.fromFunction1(value))
  }
}
