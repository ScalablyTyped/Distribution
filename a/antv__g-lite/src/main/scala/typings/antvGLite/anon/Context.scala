package typings.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var context: Any
  
  def fn(args: Any*): Any
  
  var once: Boolean
}
object Context {
  
  inline def apply(context: Any, fn: /* repeated */ Any => Any, once: Boolean): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), once = once.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setFn(value: /* repeated */ Any => Any): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
  }
}
