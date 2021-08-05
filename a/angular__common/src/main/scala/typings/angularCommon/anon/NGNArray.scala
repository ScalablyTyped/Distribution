package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NGNArray extends StObject {
  
  var NGN: js.Array[String]
}
object NGNArray {
  
  inline def apply(NGN: js.Array[String]): NGNArray = {
    val __obj = js.Dynamic.literal(NGN = NGN.asInstanceOf[js.Any])
    __obj.asInstanceOf[NGNArray]
  }
  
  extension [Self <: NGNArray](x: Self) {
    
    inline def setNGN(value: js.Array[String]): Self = StObject.set(x, "NGN", value.asInstanceOf[js.Any])
    
    inline def setNGNVarargs(value: String*): Self = StObject.set(x, "NGN", js.Array(value :_*))
  }
}
