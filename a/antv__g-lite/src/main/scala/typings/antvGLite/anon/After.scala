package typings.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait After extends StObject {
  
  var after: Any
  
  var before: Any
}
object After {
  
  inline def apply(after: Any, before: Any): After = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: After] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: Any): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: Any): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
  }
}
