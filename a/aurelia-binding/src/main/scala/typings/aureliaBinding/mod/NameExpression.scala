package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameExpression extends StObject {
  
  def createBinding(target: js.Any): Binding
}
object NameExpression {
  
  inline def apply(createBinding: js.Any => Binding): NameExpression = {
    val __obj = js.Dynamic.literal(createBinding = js.Any.fromFunction1(createBinding))
    __obj.asInstanceOf[NameExpression]
  }
  
  extension [Self <: NameExpression](x: Self) {
    
    inline def setCreateBinding(value: js.Any => Binding): Self = StObject.set(x, "createBinding", js.Any.fromFunction1(value))
  }
}
