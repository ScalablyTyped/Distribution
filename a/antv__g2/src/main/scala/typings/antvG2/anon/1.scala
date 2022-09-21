package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var path: js.Array[js.Array[String | Double]]
}
object `1` {
  
  inline def apply(path: js.Array[js.Array[String | Double]]): `1` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setPath(value: js.Array[js.Array[String | Double]]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: (js.Array[String | Double])*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
