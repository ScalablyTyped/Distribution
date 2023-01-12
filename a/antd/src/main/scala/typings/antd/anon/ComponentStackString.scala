package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentStackString extends StObject {
  
  var componentStack: String
}
object ComponentStackString {
  
  inline def apply(componentStack: String): ComponentStackString = {
    val __obj = js.Dynamic.literal(componentStack = componentStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentStackString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentStackString] (val x: Self) extends AnyVal {
    
    inline def setComponentStack(value: String): Self = StObject.set(x, "componentStack", value.asInstanceOf[js.Any])
  }
}
