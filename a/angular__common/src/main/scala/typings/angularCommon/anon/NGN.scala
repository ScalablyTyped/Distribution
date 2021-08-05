package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NGN extends StObject {
  
  var JPY: js.Array[String]
  
  var NGN: js.Array[String]
  
  var USD: js.Array[String]
}
object NGN {
  
  inline def apply(JPY: js.Array[String], NGN: js.Array[String], USD: js.Array[String]): NGN = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NGN = NGN.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NGN]
  }
  
  extension [Self <: NGN](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setNGN(value: js.Array[String]): Self = StObject.set(x, "NGN", value.asInstanceOf[js.Any])
    
    inline def setNGNVarargs(value: String*): Self = StObject.set(x, "NGN", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
