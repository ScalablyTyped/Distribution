package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathArray extends StObject {
  
  var path: js.Array[Any]
}
object PathArray {
  
  inline def apply(path: js.Array[Any]): PathArray = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathArray] (val x: Self) extends AnyVal {
    
    inline def setPath(value: js.Array[Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Any*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
